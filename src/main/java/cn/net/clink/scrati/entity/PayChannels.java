package cn.net.clink.scrati.entity;

import java.util.regex.Pattern;

public class PayChannels {

       public static void main(String[] args) {
        long value =
                PayChannels.UNION_PAY.value
                        | PayChannels.ADVANCE.value;
        System.out.println(value);
    }

    public static final PayChannel WEIXIN_PAY = new PayChannel("微信支付", "WEIXIN_PAY", 1, 18, "13");
    public static final PayChannel ALI_PAY = new PayChannel("支付宝", "ALIPAY", 2, 18, "28");
    public static final PayChannel UNION_PAY = new PayChannel("银联钱包", "UNION_PAY", 4, 21, "1010");
    public static final PayChannel TEN_PAY = new PayChannel("QQ钱包", "TEN_PAY", 8, 18, "91");
    public static final PayChannel BAIDU_WALLET = new PayChannel("百度钱包", "BAIDU_PAY", 16, 18, "31");
    public static final PayChannel JD_PAY = new PayChannel("京东钱包", "JD_PAY", 32, 18, "18");
    public static final PayChannel QUICK_PAY = new PayChannel("快捷支付", "QUICK_PAY", 64, null, null);
    public static final PayChannel ADVANCE = new PayChannel("代付", "ADVANCE", 128, null, null);
    public static final PayChannel GATEWAY = new PayChannel("网关支付", "GATEWAY", 256, null, null);
    public static final PayChannel UNION_ONLINE = new PayChannel("银联在线", "UNION_ONLINE", 512, null, null);
    public static PayChannel fromAuthCode(String authCode) {
        if (authCode != null && !"".equals(authCode)) {
            if (WEIXIN_PAY.checkPayCode(authCode)) return WEIXIN_PAY;
            if (ALI_PAY.checkPayCode(authCode)) return ALI_PAY;
            if (UNION_PAY.checkPayCode(authCode)) return UNION_PAY;
            if (TEN_PAY.checkPayCode(authCode)) return TEN_PAY;
            if (BAIDU_WALLET.checkPayCode(authCode)) return BAIDU_WALLET;
            if (JD_PAY.checkPayCode(authCode)) return JD_PAY;
            if (UNION_ONLINE.checkPayCode(authCode)) return UNION_ONLINE;
        }
        return null;
    }

    public static PayChannel fromString(String code) {
        if (code == null || "".equals(code)) return null;
        switch (code) {
            case "WEIXIN_PAY":
                return WEIXIN_PAY;
            case "ALIPAY":
                return ALI_PAY;
            case "UNION_PAY":
                return UNION_PAY;
            case "TEN_PAY":
                return TEN_PAY;
            case "BAIDU_PAY":
                return BAIDU_WALLET;
            case "JD_PAY":
                return JD_PAY;
            case "QUICK_PAY":
                return QUICK_PAY;
            case "ADVANCE":
                return ADVANCE;
            case "GATEWAY":
                return GATEWAY;
            case "UNION_ONLINE":
                return UNION_ONLINE;
            default:
                return null;
        }
    }

    public static PayChannel fromValue(Integer value) {
        if(value == null) return null;
        switch (value) {
            case 1:
                return WEIXIN_PAY;
            case 2:
                return ALI_PAY;
            case 4:
                return UNION_PAY;
            case 8:
                return TEN_PAY;
            case 16:
                return BAIDU_WALLET;
            case 32:
                return JD_PAY;
            case 64:
                return QUICK_PAY;
            case 128:
                return ADVANCE;
            case 256:
                return GATEWAY;
            case 512:
                return UNION_ONLINE;
            default:
                return null;
        }
    }

    public static class PayChannel {

        private String name;
        private String code;
        private Integer value;
        private Integer payCodeLength;
        private String payCodeStartsWith;

        @Override
        public String toString() {
            return getName();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            PayChannel that = (PayChannel) o;
            return value.equals(that.value);
        }

        @Override
        public int hashCode() {
            return value.hashCode();
        }

        public PayChannel() { }

        public PayChannel(String name, String code, Integer value
                , Integer payCodeLength, String payCodeStartsWith) {
            this.name = name;
            this.code = code;
            this.value = value;
            this.payCodeLength = payCodeLength;
            this.payCodeStartsWith = payCodeStartsWith;
        }

        public boolean checkPayCode(String payCode) {
            if (this.payCodeLength == null || (
                    this.payCodeStartsWith == null ||
                            "".equals(this.payCodeStartsWith))) {
                return false;
            }
            if(!isSpecNumber(payCode, this.payCodeLength)
                    && !isSpecNumber(payCode, 17)) return false;
            return payCode.startsWith(this.payCodeStartsWith);
        }

        private static boolean isSpecNumber(String str, int specLen) {
            if (str == null || "".equals(str)) return false;
            Pattern pattern = Pattern.compile(("^[0-9]{" + specLen + "}$"));
            return pattern.matcher(str).matches();
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

        public Integer getPayCodeLength() {
            return payCodeLength;
        }

        public void setPayCodeLength(Integer payCodeLength) {
            this.payCodeLength = payCodeLength;
        }

        public String getPayCodeStartsWith() {
            return payCodeStartsWith;
        }

        public void setPayCodeStartsWith(String payCodeStartsWith) {
            this.payCodeStartsWith = payCodeStartsWith;
        }

    }

}
