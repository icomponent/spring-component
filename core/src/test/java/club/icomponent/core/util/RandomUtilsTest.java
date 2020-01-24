package club.icomponent.util;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RandomUtilsTest {

    @Test
    void randomString() {
        String blank = RandomUtils.randomString(1, "");
        assertThat(blank.length()).isEqualTo(0);

        blank = RandomUtils.randomString(0, RandomUtils.DIGIT);
        assertThat(blank.length()).isEqualTo(0);

        int size = 10;
        String random = RandomUtils.randomString(size, RandomUtils.UPPER);
        assertThat(random.length()).isEqualTo(size);

        random = RandomUtils.randomString(size, RandomUtils.LOWER);
        assertThat(random.length()).isEqualTo(size);

        random = RandomUtils.randomString(size, RandomUtils.DIGIT);
        assertThat(random.length()).isEqualTo(size);

        random = RandomUtils.randomString(size, RandomUtils.ALPHA_NUM);
        assertThat(random.length()).isEqualTo(size);

        random = RandomUtils.randomString(size);
        assertThat(random.length()).isEqualTo(size);
    }
}