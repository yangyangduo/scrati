package cn.net.clink.scrati;

public class ScratiConfig {

    // 合作方机构号（平台分配）
    private String org;

    // 合作方 AES 密钥（平台分配）
    private String aseKey;

    // 合作方私钥（合作方生成）
    private String partnerPrivateKey;

    // 平台方公钥（平台分配）
    private String platformPublicKey;

    // 接入地址
    private String gatewayUrl;

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public String getAseKey() {
        return aseKey;
    }

    public void setAseKey(String aseKey) {
        this.aseKey = aseKey;
    }

    public String getPartnerPrivateKey() {
        return partnerPrivateKey;
    }

    public void setPartnerPrivateKey(String partnerPrivateKey) {
        this.partnerPrivateKey = partnerPrivateKey;
    }

    public String getPlatformPublicKey() {
        return platformPublicKey;
    }

    public void setPlatformPublicKey(String platformPublicKey) {
        this.platformPublicKey = platformPublicKey;
    }

    public String getGatewayUrl() {
        return gatewayUrl;
    }

    public void setGatewayUrl(String gatewayUrl) {
        this.gatewayUrl = gatewayUrl;
    }
}
