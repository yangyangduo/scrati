package com.optmius.sdk;

public class ScratiException extends Exception {

    private String errorCode;
    private String errorCodeDes;
    private Throwable th;

    public ScratiException() {
        super();
    }

    public ScratiException(String errorCode, String errorCodeDes) {
        super(errorCodeDes);
        this.errorCode = errorCode;
        this.errorCodeDes = errorCodeDes;
    }

    public ScratiException(String errorCode, String errorCodeDes, Throwable th) {
        super(errorCodeDes);
        this.errorCode = errorCode;
        this.errorCodeDes = errorCodeDes;
        this.th = th;
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

    public Throwable getTh() {
        return th;
    }

    public void setTh(Throwable th) {
        this.th = th;
    }
}
