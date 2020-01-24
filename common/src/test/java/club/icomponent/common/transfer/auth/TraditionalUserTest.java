package club.icomponent.common.transfer.auth;

import club.icomponent.core.util.RandomUtils;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TraditionalUserTest {

    @Test
    void valid() {
        final String valid = RandomUtils.randomString(5);
        assertThat(new TraditionalUser(null, null).valid()).isFalse();
        assertThat(new TraditionalUser("", "").valid()).isFalse();
        assertThat(new TraditionalUser(valid, null).valid()).isFalse();
        assertThat(new TraditionalUser(valid, "").valid()).isFalse();
        assertThat(new TraditionalUser(null, valid).valid()).isFalse();
        assertThat(new TraditionalUser("", valid).valid()).isFalse();
        assertThat(new TraditionalUser(valid, valid).valid()).isTrue();
    }
}