package cn.net.clink.scrati.entity;

import java.util.Map;

public class ScanpayResp extends ScratiCommonResp {

    // 商户订单号
    private String orderId;
    // 交易流水号
    private Long tradeId;
    // 渠道订单号
    private String rootOrderId;

    private String payChannel;
    private String tradeType;
    private String feeType;
    private Long totalAmount;
    private String tradeState;

    private String codeUrl;
    private Map<String, Object> orderInfo;
    private String tradeUrl;
    private String tradeHtml;

    private Long actualPayAmount;
    private String openId;
    private String isSubscribe;
    private String subOpenId;
    private String subIsSubscribe;
    private String accountId;
    private String fundBills;
    private String bankType;

    // 付款日期
    private String endDate;
    // 付款时间
    private String endTime;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Long getTradeId() {
        return tradeId;
    }

    public void setTradeId(Long tradeId) {
        this.tradeId = tradeId;
    }

    public String getRootOrderId() {
        return rootOrderId;
    }

    public void setRootOrderId(String rootOrderId) {
        this.rootOrderId = rootOrderId;
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
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

    public String getTradeState() {
        return tradeState;
    }

    public void setTradeState(String tradeState) {
        this.tradeState = tradeState;
    }

    public String getCodeUrl() {
        return codeUrl;
    }

    public void setCodeUrl(String codeUrl) {
        this.codeUrl = codeUrl;
    }

    public Map<String, Object> getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(Map<String, Object> orderInfo) {
        this.orderInfo = orderInfo;
    }

    public String getTradeUrl() {
        return tradeUrl;
    }

    public void setTradeUrl(String tradeUrl) {
        this.tradeUrl = tradeUrl;
    }

    public String getTradeHtml() {
        return tradeHtml;
    }

    public void setTradeHtml(String tradeHtml) {
        this.tradeHtml = tradeHtml;
    }

    public Long getActualPayAmount() {
        return actualPayAmount;
    }

    public void setActualPayAmount(Long actualPayAmount) {
        this.actualPayAmount = actualPayAmount;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getIsSubscribe() {
        return isSubscribe;
    }

    public void setIsSubscribe(String isSubscribe) {
        this.isSubscribe = isSubscribe;
    }

    public String getSubOpenId() {
        return subOpenId;
    }

    public void setSubOpenId(String subOpenId) {
        this.subOpenId = subOpenId;
    }

    public String getSubIsSubscribe() {
        return subIsSubscribe;
    }

    public void setSubIsSubscribe(String subIsSubscribe) {
        this.subIsSubscribe = subIsSubscribe;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getFundBills() {
        return fundBills;
    }

    public void setFundBills(String fundBills) {
        this.fundBills = fundBills;
    }

    public String getBankType() {
        return bankType;
    }

    public void setBankType(String bankType) {
        this.bankType = bankType;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

}
