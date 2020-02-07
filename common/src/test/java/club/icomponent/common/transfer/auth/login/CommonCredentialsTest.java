package club.icomponent.common.transfer.auth.login;

import club.icomponent.common.transfer.auth.CommonCredentials;
import club.icomponent.core.util.RandomUtils;
import club.icomponent.core.util.ValidationUtils;
import org.junit.jupiter.api.Test;

class CommonCredentialsTest {

    @Test
    void valid() {
        CommonCredentials credentials = new CommonCredentials();
        credentials.setUsername(RandomUtils.randomString(8));
        credentials.setPassword(RandomUtils.randomString(8));
        ValidationUtils.validate(credentials);
    }
}