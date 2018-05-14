package com.optmius.sdk.entity;

public class IndividualMchUpdateSettlementReq extends ScratiCommonReq {

    private String mchId;
    private String beneficiaryName;
    private String accountNumber;
    private String bankName;
    private String subBranchName;
    private String headUnitedBankNumber;
    private String unitedBankNumber;
    private String beneficiaryCertNo;
    private String bankCardMobile;
    private String accountType;
    private String province;
    private String provinceName;
    private String city;
    private String cityName;

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

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getSubBranchName() {
        return subBranchName;
    }

    public void setSubBranchName(String subBranchName) {
        this.subBranchName = subBranchName;
    }

    public String getHeadUnitedBankNumber() {
        return headUnitedBankNumber;
    }

    public void setHeadUnitedBankNumber(String headUnitedBankNumber) {
        this.headUnitedBankNumber = headUnitedBankNumber;
    }

    public String getUnitedBankNumber() {
        return unitedBankNumber;
    }

    public void setUnitedBankNumber(String unitedBankNumber) {
        this.unitedBankNumber = unitedBankNumber;
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

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
