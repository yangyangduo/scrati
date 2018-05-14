package cn.net.clink.scrati.entity;

public enum OSPlatform {

    Android(1), IOS(2), Web(4), AndroidWeb(5), IOSWeb(6);

    private int value;

    OSPlatform(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static OSPlatform fromString(String osPlatform) {
        if (osPlatform == null || "".equals(osPlatform)) return null;
        switch (osPlatform) {
            case "Android":
                return Android;
            case "IOS":
                return IOS;
            case "Web":
                return Web;
            case "AndroidWeb":
                return AndroidWeb;
            case "IOSWeb":
                return IOSWeb;
            default:
                return null;
        }
    }

    public static boolean containsAndroid(String osPlatform) {
        OSPlatform osPlatform_ = fromString(osPlatform);
        if (osPlatform_ == null) return false;
        return osPlatform_.Android.getValue() ==
                (osPlatform_.getValue() & osPlatform_.Android.getValue());
    }

    public static boolean containsIOS(String osPlatform) {
        OSPlatform osPlatform_ = fromString(osPlatform);
        if (osPlatform_ == null) return false;
        return osPlatform_.IOS.getValue() ==
                (osPlatform_.getValue() & osPlatform_.IOS.getValue());
    }

    public static boolean containsWeb(String osPlatform) {
        OSPlatform osPlatform_ = fromString(osPlatform);
        if (osPlatform_ == null) return false;
        return osPlatform_.Web.getValue() ==
                (osPlatform_.getValue() & osPlatform_.Web.getValue());
    }

    public static boolean isAndroid(String osPlatform) {
        return Android.equals(fromString(osPlatform));
    }

    public static boolean isIOS(String osPlatform) {
        return IOS.equals(fromString(osPlatform));
    }

    public static boolean isWeb(String osPlatform) {
        return Web.equals(fromString(osPlatform));
    }

    public static boolean isAndroidWeb(String osPlatform) {
        return AndroidWeb.equals(fromString(osPlatform));
    }

    public static boolean isIOSWeb(String osPlatform) {
        return IOSWeb.equals(fromString(osPlatform));
    }

    public static boolean isValid(String osPlatform) {
        return fromString(osPlatform) != null;
    }

}
