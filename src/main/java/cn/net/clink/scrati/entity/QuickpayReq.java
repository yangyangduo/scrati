package cn.net.clink.scrati.entity;

public class QuickpayReq extends ScratiCommonReq {

    private String mchId;
    private String orderId;
    private String prodId;
    private String title;
    private String body;
    private String feeType;
    private Long totalAmount;
    private String settlementPeriod;
    // 交易异步通知
    private String notifyUrl;
    // 前端页面跳转地址
    private String redirectUrl;
    private String ipAddress;
    private Integer expireInMinutes;

    // 支付卡信息
    private BankCard paymentInfo;

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
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

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
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

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Integer getExpireInMinutes() {
        return expireInMinutes;
    }

    public void setExpireInMinutes(Integer expireInMinutes) {
        this.expireInMinutes = expireInMinutes;
    }

    public BankCard getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(BankCard paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

}
