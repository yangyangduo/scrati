package cn.net.clink.scrati.entity;

import java.util.List;

public class IndividualMchOpenProductReq extends ScratiCommonReq {

    private String mchId;
    private String prodId;
    private String notifyUrl;
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

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public List<MchFee> getFees() {
        return fees;
    }

    public void setFees(List<MchFee> fees) {
        this.fees = fees;
    }

}
