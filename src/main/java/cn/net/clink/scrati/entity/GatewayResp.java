package cn.net.clink.scrati.entity;

public class GatewayResp extends ScratiCommonResp {

    // 交易流水号
    private Long tradeId;
    private String orderId;
    private String tradeState;
    private String tradeUrl;
    private String tradeHtml;

    public Long getTradeId() {
        return tradeId;
    }

    public void setTradeId(Long tradeId) {
        this.tradeId = tradeId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getTradeState() {
        return tradeState;
    }

    public void setTradeState(String tradeState) {
        this.tradeState = tradeState;
    }

    public String getTradeUrl() {
        return tradeUrl;
    }

    public void setTradeUrl(String tradeUrl) {
        this.tradeUrl = tradeUrl;
    }

    public String getTradeHtml() {
        return tradeHtml;
    }

    public void setTradeHtml(String tradeHtml) {
        this.tradeHtml = tradeHtml;
    }

}
