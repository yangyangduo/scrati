package com.optmius.sdk.entity;

import java.util.List;

public class IndividualMchUpdateProductReq extends ScratiCommonReq {

    private String mchId;
    private String prodId;
    private List<MchFee> fees;

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

    public List<MchFee> getFees() {
        return fees;
    }

    public void setFees(List<MchFee> fees) {
        this.fees = fees;
    }

}
