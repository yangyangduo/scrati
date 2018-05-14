package com.optmius.sdk.entity;

import java.math.BigDecimal;

public class MchFee {

    private String feeType;
    private BigDecimal rate;
    private Integer fixedFee;
    private Integer minFee = 0;
    private Integer maxFee = 999999999;

    // 产品编号，查询商户费率信息时返回
    private String prodId;

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public Integer getFixedFee() {
        return fixedFee;
    }

    public void setFixedFee(Integer fixedFee) {
        this.fixedFee = fixedFee;
    }

    public Integer getMinFee() {
        return minFee;
    }

    public void setMinFee(Integer minFee) {
        this.minFee = minFee;
    }

    public Integer getMaxFee() {
        return maxFee;
    }

    public void setMaxFee(Integer maxFee) {
        this.maxFee = maxFee;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

}
