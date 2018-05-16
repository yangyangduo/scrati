package cn.net.clink.scrati;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import cn.net.clink.scrati.entity.ScratiCommonReq;
import cn.net.clink.scrati.entity.ScratiCommonResp;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Scrati {

    private static final Logger logger = Logger.getLogger(Scrati.class);

    private boolean debug = false;

    private static final Scrati scrati = new Scrati();

    private ScratiConfig scratiConfig;

    private HttpClientProvider httpClientProvider;

    private Scrati() {
        this.httpClientProvider = new HttpClientProvider();
    }

    public static Scrati getInstance() {
        return scrati;
    }

    public <T extends ScratiCommonResp> T execute(String method
            , ScratiCommonReq scratiCommonReq, Class<T> clazz) throws ScratiException {
        if (scratiConfig == null) {
            throw new ScratiException("400000", "SDK参数未初始化");
        }
        if (scratiConfig.getOrg() == null || "".equals(scratiConfig.getOrg().trim())) {
            throw new ScratiException("400000", "机构号不能为空");
        }
        if (scratiConfig.getAesKey() == null || "".equals(scratiConfig.getAesKey().trim())) {
            throw new ScratiException("400000", "AES密钥不能为空");
        }
        if (scratiConfig.getPartnerPrivateKey() == null ||
                "".equals(scratiConfig.getPartnerPrivateKey().trim())) {
            throw new ScratiException("400000", "合作方私钥不能为空");
        }
        if (method == null || "".equals(method.trim())) {
            throw new ScratiException("400000", "方法服务名不能为空");
        }
        if (scratiCommonReq == null) {
            throw new ScratiException("400000", "请求数据不能为空");
        }
        if (clazz == null) {
            throw new ScratiException("400000", "clazz不能为空");
        }
        HttpPost httpPost = null;
        CloseableHttpResponse response = null;
        try {
            String reqJson = JSON.toJSONString(scratiCommonReq);
            if (debug) {
                logger.info("< ScratiSdk Request Biz Data:\r\n" + reqJson + "\r\n");
            }
            String encryptData = AESUtil.encryptToHex(this.scratiConfig.getAesKey(), reqJson);
            Map<String, Object> request = new HashMap<>();
            request.put("org", this.scratiConfig.getOrg());
            request.put("method", method);
            request.put("traceId", UUID.randomUUID().toString().replaceAll("-", ""));
            request.put("timestamp", System.currentTimeMillis() + "");
            request.put("request", encryptData);
            request.put("sign", RSAUtil.signToBase64(
                    UrlParamUtil.createLinkString(request).getBytes(),
                    this.scratiConfig.getPartnerPrivateKey(), "SHA1WithRSA"));
            String requestJson = JSON.toJSONString(request);
            if (debug) {
                logger.info("< ScratiSdk Request:\r\n" + requestJson + "\r\n");
            }
            httpPost = this.httpClientProvider.getHttpPost(this.scratiConfig.getGatewayUrl());
            httpPost.setHeader(HttpHeaders.CONTENT_TYPE, "application/json");
            httpPost.setEntity(new StringEntity(requestJson, Charset.forName("UTF-8")));
            response = this.httpClientProvider.getHttpClient().execute(httpPost);
            if (HttpStatus.SC_OK == response.getStatusLine().getStatusCode()) {
                String respStr = EntityUtils.toString(response.getEntity(), "UTF-8");
                if (this.debug) {
                    logger.info("< ScratiSdk Response:\r\n" + respStr + "\r\n");
                }
                JSONObject respJsonObj = JSON.parseObject(respStr);
                if (!"000000".equals(respJsonObj.getString("rstCode"))) {
                    throw new ScratiException(
                            respJsonObj.getString("rstCode"),
                            respJsonObj.getString("rstMsg"));
                }
                String respSign = respJsonObj.getString("sign");
                respJsonObj.remove("sign");
                if (!RSAUtil.verifyFromBase64Sign(
                        UrlParamUtil.createLinkString(respJsonObj).getBytes(),
                        respSign, this.scratiConfig.getPlatformPublicKey(), "SHA1WithRSA"
                )) {
                    throw new ScratiException("999999", "返回报文验签失败");
                }
                try {
                    String respJson = AESUtil.decryptFromHex(
                            this.scratiConfig.getAesKey(), respJsonObj.getString("encryptData"));
                    if (debug) {
                        logger.info("< ScratiSdk Response Biz Data:\r\n" + respJson + "\r\n");
                    }
                    return JSON.parseObject(respJson, clazz);
                } catch (Throwable th) {
                    logger.info("< ScratiSdk Response:\r\n" + respStr + "\r\n");
                    throw new ScratiException("999999", "返回报文解密失败", th);
                }
            } else {
                throw new ScratiException("999999", "服务调用失败(StatusCode="
                        + response.getStatusLine().getStatusCode() +  ")");
            }
        } catch (ScratiException ex) {
            throw ex;
        } catch (Throwable th) {
            logger.error("< Call Scrati Service On Error", th);
            throw new ScratiException("999999", "服务调用失败", th);
        } finally {
            if (httpPost != null) {
                try {
                    httpPost.releaseConnection();
                } catch (Throwable th) {
                }
            }
            if (response != null) {
                try {
                    response.close();
                } catch (Throwable th) {
                }
            }
        }
    }

    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    public void setConfig(ScratiConfig scratiConfig) {
        this.scratiConfig = scratiConfig;
    }

    public ScratiConfig getConfig() {
        return scratiConfig;
    }

}
