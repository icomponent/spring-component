package club.yunzhi.app.entity;

import club.yunzhi.app.util.DataUtils;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
@ExtendWith(SpringExtension.class)
class UserTest {

    @Test
    void lombok() {
        log.debug("生成用户名与密码");
        String username = DataUtils.randomString(10);
        String password = DataUtils.randomString(10);

        log.debug("设置信息");
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        log.debug("获取信息，断言成功");
        assertThat(user.getUsername()).isEqualTo(username);
        assertThat(user.getPassword()).isEqualTo(password);
    }
}