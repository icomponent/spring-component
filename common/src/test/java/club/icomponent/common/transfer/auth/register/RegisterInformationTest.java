package club.icomponent.common.transfer.auth.register;

import club.icomponent.core.util.RandomUtils;
import club.icomponent.core.util.ValidationUtils;
import org.junit.jupiter.api.Test;

class RegisterInformationTest {

    @Test
    void valid() {
        RegisterInformation information = new RegisterInformation();
        information.setUsername(RandomUtils.randomString(8));
        information.setPassword(RandomUtils.randomString(8));
        information.setEmail(RandomUtils.randomString(5) + "@mail.com");
        information.setCode(RandomUtils.randomString(4));
        ValidationUtils.validate(information);
    }
}