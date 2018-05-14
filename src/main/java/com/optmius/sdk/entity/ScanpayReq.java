package com.optmius.sdk.entity;

import java.util.List;

public class ScanpayReq extends ScratiCommonReq {

    // 商户号
    private String mchId;
    // 产品ID
    private String prodId;
    // 合作方订单号
    private String orderId;
    // 门店编号
    private String storeId;
    // 终端编号
    private String terminalId;
    // 收银员编号
    private String operatorId;
    // IP地址
    private String ipAddress;
    // 交易类型
    private String tradeType;
    // 支付渠道
    private String payChannel;
    // 交易总金额: 单位分
    private Long totalAmount;
    // 结算周期
    private String settlementPeriod;
    // 货币类型
    private String feeType;
    // 商品标题
    private String title;
    // 商品描述
    private String body;
    // 商品详情
    private List<Goods> goodsList;
    // 订单优惠标记，代金券或立减优惠功能的参数
    private String goodsTag;
    // 备注信息
    private String attach;

    // 支付授权码
    private String authCode;
    // 是否原生公众号或服务窗支付
    private Boolean isRaw;
    // 前端跳转页面
    private String jumpUrl;
    // 异步通知地址
    private String notifyUrl;
    // JS_API支付 微信用户openId, 支付宝用户buyerId
    private String openId;
    // 支付宝买家账号
    private String buyerAccount;
    // 对于支付宝 sys_service_provider_id
    private String sysServiceProviderId;

    private String osPlatform;
    private String appName;
    private String packageName;
    private String bundleId;
    private String wapUrl;

    // 订单失效时间
    private Integer expireInMinutes;

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    public Long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getSettlementPeriod() {
        return settlementPeriod;
    }

    public void setSettlementPeriod(String settlementPeriod) {
        this.settlementPeriod = settlementPeriod;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }

    public String getGoodsTag() {
        return goodsTag;
    }

    public void setGoodsTag(String goodsTag) {
        this.goodsTag = goodsTag;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public Boolean getRaw() {
        return isRaw;
    }

    public void setRaw(Boolean raw) {
        isRaw = raw;
    }

    public String getJumpUrl() {
        return jumpUrl;
    }

    public void setJumpUrl(String jumpUrl) {
        this.jumpUrl = jumpUrl;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getBuyerAccount() {
        return buyerAccount;
    }

    public void setBuyerAccount(String buyerAccount) {
        this.buyerAccount = buyerAccount;
    }

    public String getSysServiceProviderId() {
        return sysServiceProviderId;
    }

    public void setSysServiceProviderId(String sysServiceProviderId) {
        this.sysServiceProviderId = sysServiceProviderId;
    }

    public String getOsPlatform() {
        return osPlatform;
    }

    public void setOsPlatform(String osPlatform) {
        this.osPlatform = osPlatform;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getBundleId() {
        return bundleId;
    }

    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    public String getWapUrl() {
        return wapUrl;
    }

    public void setWapUrl(String wapUrl) {
        this.wapUrl = wapUrl;
    }

    public Integer getExpireInMinutes() {
        return expireInMinutes;
    }

    public void setExpireInMinutes(Integer expireInMinutes) {
        this.expireInMinutes = expireInMinutes;
    }

}
