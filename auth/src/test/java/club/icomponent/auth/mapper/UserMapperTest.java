package club.icomponent.auth.mapper;

import club.icomponent.common.auth.User;
import club.icomponent.util.RandomUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class UserMapperTest {

    private static final Logger logger = LoggerFactory.getLogger(UserMapperTest.class);

    @Autowired
    private UserMapper userMapper;

    @Test
    void insertUser() {
        logger.debug("生成随机用户");
        User user = new User();
        user.setName(RandomUtils.randomString(10));
        user.setUsername(RandomUtils.randomString(10));
        user.setPassword(RandomUtils.randomString(10));

        logger.debug("插入数据");
        userMapper.insertUser(user);
    }

    @Test
    void selectUserByUsername() {
        logger.debug("生成随机用户");
        User user = new User();
        user.setName(RandomUtils.randomString(10));
        user.setUsername(RandomUtils.randomString(10));
        user.setPassword(RandomUtils.randomString(10));

        logger.debug("插入数据");
        userMapper.insertUser(user);

        logger.debug("查询数据");
        User selectedUser = userMapper.selectUserByUsername(user.getUsername());

        logger.debug("断言一致性");
        assertThat(selectedUser.getId()).isNotNull();
        assertThat(selectedUser.getName()).isEqualTo(user.getName());
        assertThat(selectedUser.getUsername()).isEqualTo(user.getUsername());
        assertThat(selectedUser.getPassword()).isEqualTo(user.getPassword());
    }
}