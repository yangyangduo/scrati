package cn.net.clink.scrati;

public class HexUtil {

    public static String byte2hex(byte[] bytes) {
        return byte2hex(bytes, 0, bytes.length);
    }

    public static String byte2hex(byte[] bytes, int offset, int length) {
        if (bytes.length > offset && bytes.length >= offset + length) {
            StringBuilder sb = new StringBuilder(length * 2);
            byte2hexAppend(bytes, offset, length, sb);
            return sb.toString().toUpperCase();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static byte[] hex2byte(String hex) {
        return hex.length() % 2 == 0?
                hex2byte(hex.getBytes(), 0, hex.length() >> 1):
                hex2byte("0" + hex);
    }

    public static byte[] hex2byte(byte[] hexBytes, int offset, int len) {
        byte[] d = new byte[len];
        for(int i = 0; i < len * 2; ++i) {
            int shift = i % 2 == 1?0:4;
            d[i >> 1] = (byte) (
                    d[i >> 1] |
                    Character.digit((char)hexBytes[offset + i], 16) << shift
            );
        }
        return d;
    }

    private static void byte2hexAppend(byte[] bs, int off, int length, StringBuilder sb) {
        if (bs.length > off && bs.length >= off + length) {
            sb.ensureCapacity(sb.length() + length * 2);
            for(int i = off; i < off + length; ++i) {
                sb.append(Character.forDigit(bs[i] >>> 4 & 15, 16));
                sb.append(Character.forDigit(bs[i] & 15, 16));
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
