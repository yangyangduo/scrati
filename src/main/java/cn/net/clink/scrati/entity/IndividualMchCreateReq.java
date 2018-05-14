package cn.net.clink.scrati.entity;

import java.util.List;

public class IndividualMchCreateReq extends ScratiCommonReq {

    private IndividualMchBase base;
    private List<SettlementBankCard> settlementCards;

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

}
