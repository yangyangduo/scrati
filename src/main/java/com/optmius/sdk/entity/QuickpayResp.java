package com.optmius.sdk.entity;

public class QuickpayResp extends ScratiCommonResp {

    private Long tradeId;
    private String orderId;
    private String tradeState;
    private String tradeHtml;
    private String tradeUrl;
    private String passcodeSendResultCode;
    private String passcodeSendErrorCode;
    private String passcodeSendErrorCodeDes;

    private String feeType;
    private String totalAmount;
    private String actualPayAmount;
    private String endDate;
    private String endTime;

    public Long getTradeId() {
        return tradeId;
    }

    public void setTradeId(Long tradeId) {
        this.tradeId = tradeId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getTradeState() {
        return tradeState;
    }

    public void setTradeState(String tradeState) {
        this.tradeState = tradeState;
    }

    public String getTradeHtml() {
        return tradeHtml;
    }

    public void setTradeHtml(String tradeHtml) {
        this.tradeHtml = tradeHtml;
    }

    public String getTradeUrl() {
        return tradeUrl;
    }

    public void setTradeUrl(String tradeUrl) {
        this.tradeUrl = tradeUrl;
    }

    public String getPasscodeSendResultCode() {
        return passcodeSendResultCode;
    }

    public void setPasscodeSendResultCode(String passcodeSendResultCode) {
        this.passcodeSendResultCode = passcodeSendResultCode;
    }

    public String getPasscodeSendErrorCode() {
        return passcodeSendErrorCode;
    }

    public void setPasscodeSendErrorCode(String passcodeSendErrorCode) {
        this.passcodeSendErrorCode = passcodeSendErrorCode;
    }

    public String getPasscodeSendErrorCodeDes() {
        return passcodeSendErrorCodeDes;
    }

    public void setPasscodeSendErrorCodeDes(String passcodeSendErrorCodeDes) {
        this.passcodeSendErrorCodeDes = passcodeSendErrorCodeDes;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getActualPayAmount() {
        return actualPayAmount;
    }

    public void setActualPayAmount(String actualPayAmount) {
        this.actualPayAmount = actualPayAmount;
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
