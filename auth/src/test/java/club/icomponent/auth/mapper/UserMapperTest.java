package club.icomponent.auth.mapper;

import club.icomponent.common.data.auth.User;
import club.icomponent.core.util.RandomUtils;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

class UserMapperTest extends MapperTest {

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