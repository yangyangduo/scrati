package com.optmius.sdk;

import org.apache.log4j.Logger;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * Java Cryptography Extension (JCE) Unlimited Strength Jurisdiction Policy Files 8 Download
 *
 * @http://www.oracle.com/technetwork/java/javase/downloads/jce8-download-2133166.html
 */
public class AESUtil {

    private static final Logger logger = Logger.getLogger(AESUtil.class);

    // 加解密算法/工作模式/填充方式
    private static final String DEFAULT_ALGORITHM = "AES/ECB/PKCS5Padding";

    public static final String encryptToHex(String key, String data) {
        return encryptToHex(key, data, DEFAULT_ALGORITHM);
    }

    public static final String encryptToHex(String key, String data, String algorithm) {
        try {
            SecretKeySpec keySpec = new SecretKeySpec(key.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance(algorithm);
            cipher.init(Cipher.ENCRYPT_MODE, keySpec);
            return HexUtil.byte2hex(cipher.doFinal(data.getBytes()));
        } catch (Throwable th) {
            logger.warn("AES EncryptToHex Fail With Key=" + key + ", Data=" + data, th);
            return null;
        }
    }

    public static final String decryptFromHex(String key, String data) {
        return decryptFromHex(key, data, DEFAULT_ALGORITHM);
    }

    public static final String decryptFromHex(String key, String data, String algorithm) {
        try {
            SecretKeySpec keySpec = new SecretKeySpec(key.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance(algorithm);
            cipher.init(Cipher.DECRYPT_MODE, keySpec);
            return new String(cipher.doFinal(HexUtil.hex2byte(data)));
        } catch (Throwable th) {
            logger.warn("AES DecryptFromHex Fail With Key=" + key + ", Data=" + data, th);
            return null;
        }
    }

}
