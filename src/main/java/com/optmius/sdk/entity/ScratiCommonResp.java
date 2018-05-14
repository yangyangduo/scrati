package com.optmius.sdk.entity;

public class ScratiCommonResp {

    private String orgNo;
    private String resultCode;
    private String errorCode;
    private String errorCodeDes;
    private String errorMsg;

    public String getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorCodeDes() {
        return errorCodeDes;
    }

    public void setErrorCodeDes(String errorCodeDes) {
        this.errorCodeDes = errorCodeDes;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
