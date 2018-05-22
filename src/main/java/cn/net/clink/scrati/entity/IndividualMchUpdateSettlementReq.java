package cn.net.clink.scrati.entity;

public class IndividualMchUpdateSettlementReq extends ScratiCommonReq {

    private String mchId;
    private String beneficiaryName;
    private String accountNumber;
    private String beneficiaryCertNo;
    private String bankCardMobile;
    private String unitedBankNumber;

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    public void setBeneficiaryName(String beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBeneficiaryCertNo() {
        return beneficiaryCertNo;
    }

    public void setBeneficiaryCertNo(String beneficiaryCertNo) {
        this.beneficiaryCertNo = beneficiaryCertNo;
    }

    public String getBankCardMobile() {
        return bankCardMobile;
    }

    public void setBankCardMobile(String bankCardMobile) {
        this.bankCardMobile = bankCardMobile;
    }

    public String getUnitedBankNumber() {
        return unitedBankNumber;
    }

    public void setUnitedBankNumber(String unitedBankNumber) {
        this.unitedBankNumber = unitedBankNumber;
    }

}
