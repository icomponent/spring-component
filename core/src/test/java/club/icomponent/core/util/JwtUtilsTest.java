package club.icomponent.core.util;

import org.junit.jupiter.api.Test;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;

import static org.assertj.core.api.Assertions.assertThat;

class JwtUtilsTest {

    @Test
    void RS256JwtTest() throws Exception {
        KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
        KeyPair pair = generator.genKeyPair();
        PublicKey publicKey = pair.getPublic();
        PrivateKey privateKey = pair.getPrivate();

        User user = new User();
        user.setId(RandomUtils.randomString(32, RandomUtils.DIGIT));
        user.setName(RandomUtils.randomString(32, RandomUtils.UPPER));

        long expiration = 5 * 60 * 1000;

        String jwt = JwtUtils.signRS256Jwt(privateKey, user, expiration);
        User subject = JwtUtils.parseRS256Jwt(publicKey, jwt, User.class);

        assertThat(subject.getId()).isEqualTo(user.getId());
        assertThat(subject.getName()).isEqualTo(user.getName());
    }

    private static final class User {

        private String id;
        private String name;

        public User() {
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}