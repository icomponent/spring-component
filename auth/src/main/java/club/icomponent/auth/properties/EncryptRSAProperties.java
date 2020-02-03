package club.icomponent.auth.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.security.PrivateKey;
import java.security.PublicKey;

@Component
@ConfigurationProperties(prefix = "app.encrypt.rsa")
public class EncryptRSAProperties {

    private PublicKey publicKey;

    private PrivateKey privateKey;

    public PublicKey getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        System.out.println(publicKey);
        // todo: string to public key
//        this.publicKey = publicKey;
    }

    public PrivateKey getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        System.out.println(privateKey);
        // todo: string to private key
//        this.privateKey = privateKey;
    }
}
