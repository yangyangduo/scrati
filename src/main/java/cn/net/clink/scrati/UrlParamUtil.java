package cn.net.clink.scrati;

import org.apache.log4j.Logger;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.*;

/**
 * Created by young on 1/14/16.
 */
public class UrlParamUtil {

    private static final Logger logger = Logger.getLogger(UrlParamUtil.class);

    public static String createLinkString(Map<String, ? extends Object> params) {
        return createLinkString(params, false);
    }

    public static String createLinkString(Map<String, ? extends Object> params, Boolean encodeValue) {
        if (params == null || params.size() == 0) return "";
        List<String> keys = new ArrayList<>(params.keySet());
        Collections.sort(keys);
        StringBuffer linkString = new StringBuffer();
        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            Object value = params.get(key);
            if (isEmpty(value)) continue;
            if (encodeValue) {
                try {
                    value = URLEncoder.encode(value.toString(), "UTF-8");
                } catch (Throwable th) {
                    continue;
                }
            }
            if(linkString.length() > 0) linkString.append("&");
            linkString.append(key).append("=").append(value);
        }
        return linkString.toString();
    }

    public static Map<String, String> fromLinkString(String linkString) {
        return fromLinkString(linkString, Boolean.FALSE);
    }

    public static Map<String, String> fromLinkString(String linkString, Boolean decodeValue) {
        Map<String, String> paramsMap = new HashMap<>();
        try {
            if (!isEmpty(linkString)) {
                String[] params = linkString.split("&");
                if (params != null && params.length > 0) {
                    for (String param : params) {
                        if (isEmpty(param) || !param.contains("=")) continue;
                        String[] kv = param.split("=");
                        if (kv == null || kv.length != 2) {
                            continue;
                        }
                        String value;
                        if (decodeValue) {
                            value = URLDecoder.decode(kv[1], "UTF-8");
                        } else {
                            value = kv[1];
                        }
                        paramsMap.put(kv[0], value);
                    }
                }
            }
        } catch (Throwable th) {
            logger.error("<<<<<< Parse Url(" + linkString + ") To Map On Error", th);
        }
        return paramsMap;
    }

    private static boolean isEmpty(Object obj) {
        if (obj == null) return true;
        if (obj instanceof String) {
            String str = (String) obj;
            return "".equals(str);
        }
        return false;
    }

    private static boolean isEmpty(String str) {
        return str == null || "".equals(str);
    }

}
