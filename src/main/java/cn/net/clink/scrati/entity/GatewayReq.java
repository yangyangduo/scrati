package cn.net.clink.scrati.entity;

import java.util.List;

public class GatewayReq extends ScratiCommonReq {

    // 商户号
    private String mchId;
    // 产品Id
    private String prodId;
    // 订单Id
    private String orderId;
    // 订单标题
    private String title;
    // 订单详情
    private String body;
    private List<Goods> goodsList;
    // 货币类型: CNY - 人民币
    private String feeType;
    // 订单金额
    private Long totalAmount;
    // 结算周期
    private String settlementPeriod;
    // 备注信息
    private String attach;

    // 前端页面跳转地址
    private String redirectUrl;
    // 交易异步通知
    private String notifyUrl;
    private Integer expireInMinutes;
    // 用户IP地址
    private String ipAddress;

    // 支付卡信息
    private BankCard paymentInfo;

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

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public Integer getExpireInMinutes() {
        return expireInMinutes;
    }

    public void setExpireInMinutes(Integer expireInMinutes) {
        this.expireInMinutes = expireInMinutes;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public BankCard getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(BankCard paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

}
