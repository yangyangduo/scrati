package com.optmius.sdk.entity;

public class AdvanceBalanceReq extends ScratiCommonReq {

    private String mchId;
    private String prodId;

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

}
