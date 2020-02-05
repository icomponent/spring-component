package club.icomponent.core.util;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringUtilsTest {

    @Test
    void isEmpty() {
        assertThat(StringUtils.isEmpty("")).isTrue();
        assertThat(StringUtils.isEmpty(" ")).isFalse();
    }

    @Test
    void isEmail() {
        assertThat(StringUtils.isEmail(null)).isFalse();
        assertThat(StringUtils.isEmail("")).isFalse();
        assertThat(StringUtils.isEmail(RandomUtils.randomString(5))).isFalse();
        assertThat(StringUtils.isEmail(RandomUtils.randomString(5) + "@mail")).isFalse();
        assertThat(StringUtils.isEmail(RandomUtils.randomString(5) + "@mail.com")).isTrue();
    }
}
