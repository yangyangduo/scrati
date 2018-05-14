package cn.net.clink.scrati.entity;

import java.util.List;

public class IndividualMch extends ScratiCommonResp {

    private IndividualMchBase base;
    private List<SettlementBankCard> settlementCards;
    private List<MchFee> fees;

    public IndividualMchBase getBase() {
        return base;
    }

    public void setBase(IndividualMchBase base) {
        this.base = base;
    }

    public List<SettlementBankCard> getSettlementCards() {
        return settlementCards;
    }

    public void setSettlementCards(List<SettlementBankCard> settlementCards) {
        this.settlementCards = settlementCards;
    }

    public List<MchFee> getFees() {
        return fees;
    }

    public void setFees(List<MchFee> fees) {
        this.fees = fees;
    }
}
