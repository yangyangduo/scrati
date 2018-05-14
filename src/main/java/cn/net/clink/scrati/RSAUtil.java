package cn.net.clink.scrati;

import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

public class RSAUtil {

    private static final Logger logger = Logger.getLogger(RSAUtil.class);

    public static String signToBase64(byte[] data, String privateKey, String algorithm) {
        byte[] signData = sign(data, privateKey, algorithm);
        try {
            return encodeBase64(signData);
        } catch (Throwable th) {
            logger.warn("<<< Encode Base64 Fail(" + signData + ")");
            return null;
        }
    }

    private static byte[] sign(byte[] data, String privateKey, String algorithm) {
        try {
            Signature signature = Signature.getInstance(algorithm);
            signature.initSign(getPrivateKey(privateKey));
            signature.update(data);
            return signature.sign();
        } catch (Throwable th) {
            logger.warn("<<< RSA Sign Data Fail", th);
            try {
                logger.warn("<<< Base64Data=" + encodeBase64(data));
            } catch (Throwable th2) {
                // ignore
            }
            return null;
        }
    }

    public static boolean verifyFromBase64Sign(
            byte[] data, String sign, String publicKey, String algorithm) {
        try {
            return verifySign(data, decodeBase64(sign), publicKey, algorithm);
        } catch (Throwable th) {
            logger.warn("<<< Decode Base64 Fail(" + sign + ")");
            return false;
        }
    }

    private static boolean verifySign(
            byte[] data, byte[] signData, String publicKey, String algorithm) {
        try {
            Signature signature = Signature.getInstance(algorithm);
            signature.initVerify(getPublicKey(publicKey));
            signature.update(data);
            return signature.verify(signData);
        } catch (Throwable th) {
            logger.warn("<<< RSA Verify Sign Fail", th);
            try {
                logger.warn("<<< Base64Data=" + encodeBase64(data));
                logger.warn("<<< Base64Sign=" + encodeBase64(signData));
                logger.warn("<<< PublicKey=" + publicKey);
            } catch (Throwable th2) {
                // ignore
            }
            return false;
        }
    }

    private static PublicKey getPublicKey(String key) throws Exception {
        X509EncodedKeySpec pubX509 = new X509EncodedKeySpec(decodeBase64(key));
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        return keyFactory.generatePublic(pubX509);
    }

    private static PrivateKey getPrivateKey(String key) throws Exception {
        PKCS8EncodedKeySpec priPKCS8 = new PKCS8EncodedKeySpec(decodeBase64(key));
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        return keyFactory.generatePrivate(priPKCS8);
    }


    private static String encodeBase64(byte[] input) throws Exception {
        return Base64.encodeBase64String(input);
        /*
        Class clazz = Class.forName("com.sun.org.apache.xerces.internal.impl.dv.util.Base64");
        Method method = clazz.getMethod("encode", byte[].class);
        method.setAccessible(true);
        return (String) method.invoke(null, new Object[] {input});
        */
    }

    private static byte[] decodeBase64(String input) throws Exception {
        return Base64.decodeBase64(input);
        /*
        Class clazz = Class.forName("com.sun.org.apache.xerces.internal.impl.dv.util.Base64");
        Method method = clazz.getMethod("decode", String.class);
        method.setAccessible(true);
        return (byte[]) method.invoke(null, input);
        */
    }


}