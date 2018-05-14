package com.optmius.sdk.entity;

public class TradeTypes {

    // 公众号内H5网页JSAPI支付
    public static final TradeType H5_JSAPI = new TradeType("公众号支付", "H5_JSAPI", 1);

    // 用户扫商家二维码 (订单码)
    public static final TradeType ORDER_CODE = new TradeType("扫码支付", "ORDER_CODE", 2);

    // APP支付
    public static final TradeType APP = new TradeType("APP支付", "APP", 4);

    // 刷卡支付
    public static final TradeType SWIPE_CARD = new TradeType("条码支付", "SWIPE_CARD", 8);

    // H5 WAP支付
    public static final TradeType H5_WAP = new TradeType("H5支付", "H5_WAP", 16);

    // 银行卡快捷支付
    public static final TradeType BANK_CARD = new TradeType("银行卡支付", "BANK_CARD", 32);

    // 余额支付
    public static final TradeType BALANCE = new TradeType("余额支付", "BALANCE", 64);

    // 贷款支付
    public static final TradeType LOANING = new TradeType("借款支付", "LOANING", 128);

    // 网关支付
    public static final TradeType GATEWAY = new TradeType("网关支付", "GATEWAY", 256);

    public static TradeType fromString(String code) {
        if (code == null || "".equals(code)) return null;
        switch (code) {
            case "H5_JSAPI":
                return H5_JSAPI;
            case "ORDER_CODE":
                return ORDER_CODE;
            case "APP":
                return APP;
            case "SWIPE_CARD":
                return SWIPE_CARD;
            case "H5_WAP":
                return H5_WAP;
            case "BANK_CARD":
                return BANK_CARD;
            case "BALANCE":
                return BALANCE;
            case "LOANING":
                return LOANING;
            case "GATEWAY":
                return GATEWAY;
            default:
                return null;
        }
    }

    public static TradeType fromValue(Integer value) {
        if(value == null) return null;
        switch (value) {
            case 1:
                return H5_JSAPI;
            case 2:
                return ORDER_CODE;
            case 4:
                return APP;
            case 8:
                return SWIPE_CARD;
            case 16:
                return H5_WAP;
            case 32:
                return BANK_CARD;
            case 64:
                return BALANCE;
            case 128:
                return LOANING;
            case 256:
                return GATEWAY;
            default:
                return null;
        }
    }

    public static class TradeType {
        private String name;
        private String code;
        private Integer value;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TradeType tradeType = (TradeType) o;
            return value.equals(tradeType.value);
        }

        @Override
        public int hashCode() {
            return value.hashCode();
        }

        public TradeType() { }

        public TradeType(String name, String code, Integer value) {
            this.name = name;
            this.code = code;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

    }

}
