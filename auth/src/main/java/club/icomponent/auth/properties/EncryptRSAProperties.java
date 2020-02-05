package club.icomponent.auth.properties;

import club.icomponent.core.exception.ApplicationStartException;
import club.icomponent.core.util.KeyUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;

@Component
@ConfigurationProperties(prefix = "app.encrypt.rsa")
public class EncryptRSAProperties {

    private static final Logger logger = LoggerFactory.getLogger(EncryptRSAProperties.class);

    private PublicKey publicKey;

    private PrivateKey privateKey;

    public PublicKey getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        try {
            this.publicKey = KeyUtils.parseRSAPublicKey(publicKey);
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            logger.error("公钥解析失败");
            throw new ApplicationStartException("公钥解析失败");
        }
    }

    public PrivateKey getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        try {
            this.privateKey = KeyUtils.parseRSAPrivateKey(privateKey);
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            logger.error("私钥解析失败");
            throw new ApplicationStartException("私钥解析失败");
        }
    }
}
