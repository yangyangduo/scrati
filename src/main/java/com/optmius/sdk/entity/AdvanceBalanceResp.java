package com.optmius.sdk.entity;

public class AdvanceBalanceResp extends ScratiCommonResp {

    private String mchId;
    private String prodId;

    // D0账户余额，可提现金额
    private Long d0Balance;
    // T1账户余额, 次日结算到D0户
    private Long t1Balance;
    // 在途资金，一般发生在D0转T1时，过渡账户
    private Long inTransitBalance;
    // 冻结资金
    private Long frozenBalance;

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

    public Long getD0Balance() {
        return d0Balance;
    }

    public void setD0Balance(Long d0Balance) {
        this.d0Balance = d0Balance;
    }

    public Long getT1Balance() {
        return t1Balance;
    }

    public void setT1Balance(Long t1Balance) {
        this.t1Balance = t1Balance;
    }

    public Long getInTransitBalance() {
        return inTransitBalance;
    }

    public void setInTransitBalance(Long inTransitBalance) {
        this.inTransitBalance = inTransitBalance;
    }

    public Long getFrozenBalance() {
        return frozenBalance;
    }

    public void setFrozenBalance(Long frozenBalance) {
        this.frozenBalance = frozenBalance;
    }
}
