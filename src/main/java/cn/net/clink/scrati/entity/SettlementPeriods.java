package cn.net.clink.scrati.entity;

public class SettlementPeriods {

    public static final String T0 = "T0";
    public static final String T1 = "T1";
    public static final String D0 = "D0";
    public static final String D1 = "D1";

    public static boolean isD0(String period) {
        return D0.equals(period);
    }

    public static boolean isD1(String period) {
        return D1.equals(period);
    }

    public static boolean isT0(String period) {
        return T0.equals(period);
    }

    public static boolean isT1(String period) {
        return T1.equals(period);
    }

}
