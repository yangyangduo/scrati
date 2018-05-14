package cn.net.clink.scrati;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class OrderIdGenerator {

    private static AtomicInteger sequence = new AtomicInteger(9921);

    public static String genUnique() {
        StringBuilder idBuilder = new StringBuilder();
        String ipAddress = IpAddressUtil.getFristIPv4();
        String suffix = ipAddress.substring(ipAddress.lastIndexOf(".") + 1);
        idBuilder.append(leftPadZero(suffix, 3));
        Date now = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("YYMMddHHmmss");
        idBuilder.append(formatter.format(now));
        int seq = sequence.incrementAndGet();
        if (seq > 9999) {
            synchronized (sequence) {
                if (sequence.get() > 9999) {
                    sequence.set(0);
                }
            }
            seq = sequence.incrementAndGet();
        }
        idBuilder.append(leftPadZero(String.valueOf(seq), 4));
        idBuilder.append(leftPadZero(String.valueOf((new Random()).nextInt(10000)), 4));
        return idBuilder.toString();
    }

    private static String leftPadZero(String str, int size) {
        int num = size - str.length();
        for (int i=0; i<num; i++) {
            str = "0" + str;
        }
        return str;
    }

}
