package im.spent.passport.service.impl;

import im.spent.passport.common.User;
import im.spent.passport.mapper.UserMapper;
import im.spent.passport.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public User findUser(String username, String password) {
        logger.debug("构造example");
        Example example = new Example(User.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("username", username);
        criteria.andEqualTo("password", password);

        logger.debug("查询用户");
        return this.userMapper.selectOneByExample(example);
    }

    @Override
    public User createUser(User user) {
        return null;
    }
}
