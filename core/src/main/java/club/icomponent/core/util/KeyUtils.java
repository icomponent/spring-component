package club.icomponent.core.util;

import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

/**
 * 密钥工具类
 */
public class KeyUtils {

    /**
     * 解析 RSA 公钥
     * @param value 公钥值
     * @return 公钥
     * @throws NoSuchAlgorithmException 解析算法不存在异常
     * @throws InvalidKeySpecException 密钥格式异常
     */
    public static PublicKey parseRSAPublicKey(String value) throws NoSuchAlgorithmException, InvalidKeySpecException {
        value = value.replace("-----BEGIN PUBLIC KEY-----\n", "");
        value = value.replace("-----END PUBLIC KEY-----", "");
        byte[] encoded = Base64.getMimeDecoder().decode(value);
        KeyFactory factory = KeyFactory.getInstance("RSA");
        return factory.generatePublic(new X509EncodedKeySpec(encoded));
    }

    /**
     * 解析 RSA 私钥
     * @param value 私钥值
     * @return 私钥
     * @throws NoSuchAlgorithmException 解析算法不存在异常
     * @throws InvalidKeySpecException 密钥格式异常
     */
    public static PrivateKey parseRSAPrivateKey(String value) throws NoSuchAlgorithmException, InvalidKeySpecException {
        value = value.replace("-----BEGIN PRIVATE KEY-----\n", "");
        value = value.replace("-----END PRIVATE KEY-----", "");
        byte[] encoded = Base64.getMimeDecoder().decode(value);
        KeyFactory factory = KeyFactory.getInstance("RSA");
        return factory.generatePrivate(new PKCS8EncodedKeySpec(encoded));
    }
}
