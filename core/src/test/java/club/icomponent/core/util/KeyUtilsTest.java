package club.icomponent.core.util;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

import static org.assertj.core.api.Assertions.assertThat;

class KeyUtilsTest {

    @Test
    void parseRSAPublicKey() throws Exception {
        final String value = "-----BEGIN PUBLIC KEY-----\n" +
                "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC35L4ns9xKDHYqlbvGF82vDWZM\n" +
                "Kijgfsf3Iwb8J3FyW4SOT9XK7Op94t+8FZdnq5TY7/O9TjUCwMGfEEiSQMKRyAGv\n" +
                "JfiFZg3xr7ir7pEtHUsqwdg7JzFHZ+4I9d4JCmWcjp3hwgpvPZEC5kCrPk3HRSZb\n" +
                "syOFZjOj7HMlvS415wIDAQAB\n" +
                "-----END PUBLIC KEY-----";
        final BigInteger n = new BigInteger("129134425859402947419297188949553027769021897910808763770116252953544104444996378153254457093784818143171202540986221305267056291679509300747976745058052338587792509169525373808076164017548752702992424301516713612345919046481454533958205722638004520581123745606091401221030368331355904599343265362997689595367");
        final BigInteger e = new BigInteger("65537");

        RSAPublicKey publicKey = (RSAPublicKey) KeyUtils.parseRSAPublicKey(value);
        assertThat(publicKey.getModulus()).isEqualTo(n);
        assertThat(publicKey.getPublicExponent()).isEqualTo(e);
    }

    @Test
    void parseRSAPrivateKey() throws Exception {
        final String value = "-----BEGIN PRIVATE KEY-----\n" +
                "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBALfkviez3EoMdiqV\n" +
                "u8YXza8NZkwqKOB+x/cjBvwncXJbhI5P1crs6n3i37wVl2erlNjv871ONQLAwZ8Q\n" +
                "SJJAwpHIAa8l+IVmDfGvuKvukS0dSyrB2DsnMUdn7gj13gkKZZyOneHCCm89kQLm\n" +
                "QKs+TcdFJluzI4VmM6PscyW9LjXnAgMBAAECgYA/2Ll0y2u2gfEdA/O36VfOaVaV\n" +
                "JyYeG6aN1al9LqyiyceSKYHO/MbFglmv0cdJhTcewuDbXyXkmMwgz+SCct2abPmO\n" +
                "lAdkfEUksABqNwpeplb7Cq6WpQt71CJY0MhPyVbH5b3C6FdeZx2zoCC7b9ZmnFpy\n" +
                "rCUwysEvHgMB21uIsQJBAOSnQMvj78srZ5AHdbRF1UXaUBOsyJ3SQUMG4nIl3n9v\n" +
                "K+EU1/ucf8fcAnOD7hgA9LAfMK4Rp6KIpHjDdZmswK0CQQDN4xDACQNIBBQc479y\n" +
                "vnyrKXa7eOfAUYknBB8qk//zix3MgFKiSfJycXGcP6KdJ7CkLp/Lzg7/kTwri4HN\n" +
                "zd9jAkBLDbtvMbqcbfrohApWyjVfYHG4g5a2dzWE0tWxskx+d/dnQnhC1vP6nnUP\n" +
                "hda5elbXGOXZvWHRMBkMqtwHPXVhAkEAvXDm4qvoVwVZtFNivyPC9oMKeul+5Jih\n" +
                "iELkonrXkbI50wdoAWflK6RykwCCkfQJNqin5BFP/5wVL0QIRePeXQJBANyB/Xi+\n" +
                "fJZkRYsadtta/LhTwQroBiBorO/tlr09+BMY8bm4Zev2n2IlaVlNmnyEDY/iMyYl\n" +
                "YgLR14r6w7RsfdU=\n" +
                "-----END PRIVATE KEY-----";
        final BigInteger n = new BigInteger("129134425859402947419297188949553027769021897910808763770116252953544104444996378153254457093784818143171202540986221305267056291679509300747976745058052338587792509169525373808076164017548752702992424301516713612345919046481454533958205722638004520581123745606091401221030368331355904599343265362997689595367");
        final BigInteger d = new BigInteger("44834593069637833064966175402568466573940282055366321479854513018675596266863719555352730773639009292914194159293230992874965269403170035693111720967559125293721988700865871989579409598059537753409663445295687433045539755846283879224562429754373386544159915674964547577934783472556161173673564302254918043825");

        RSAPrivateKey privateKey = (RSAPrivateKey) KeyUtils.parseRSAPrivateKey(value);
        assertThat(privateKey.getModulus()).isEqualTo(n);
        assertThat(privateKey.getPrivateExponent()).isEqualTo(d);
    }
}