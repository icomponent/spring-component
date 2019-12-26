package club.yunzhi.app.util;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
@ExtendWith(SpringExtension.class)
class DataUtilsTest {

    @Test
    void randomString() {
        String string;

        log.debug("输入-10，得到长度为0的字符串");
        string = DataUtils.randomString(-10);
        assertThat(string.length()).isZero();

        log.debug("输入0，得到长度为0的字符串");
        string = DataUtils.randomString(0);
        assertThat(string.length()).isZero();

        log.debug("输入10，得到长度为10的字符串");
        string = DataUtils.randomString(10);
        assertThat(string.length()).isEqualTo(10);

        log.debug("断言字符串随机");
        String string2 = DataUtils.randomString(10);
        assertThat(string2).isNotEqualTo(string);
    }
}