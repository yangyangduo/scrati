package cn.net.clink.scrati.entity;

public class BankCard extends ScratiCommonReq {

    // 持卡人信息
    private String name;
    private String certType;
    private String certNo;

    // 支付卡信息（已绑卡）
    private String token;

    // 支付卡信息（未绑卡）
    private String bankCardNo;
    private String mobile;
    private String cvv2;
    private String validThru;

    private String bankCode;
    private String unitedBankNo;
    private String headUnitedBankNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCvv2() {
        return cvv2;
    }

    public void setCvv2(String cvv2) {
        this.cvv2 = cvv2;
    }

    public String getValidThru() {
        return validThru;
    }

    public void setValidThru(String validThru) {
        this.validThru = validThru;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getUnitedBankNo() {
        return unitedBankNo;
    }

    public void setUnitedBankNo(String unitedBankNo) {
        this.unitedBankNo = unitedBankNo;
    }

    public String getHeadUnitedBankNo() {
        return headUnitedBankNo;
    }

    public void setHeadUnitedBankNo(String headUnitedBankNo) {
        this.headUnitedBankNo = headUnitedBankNo;
    }
}
