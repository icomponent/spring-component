package club.icomponent.auth.service.api;

import club.icomponent.auth.mapper.UserMapper;
import club.icomponent.auth.service.UserService;
import club.icomponent.common.data.auth.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserMapper userMapper, PasswordEncoder passwordEncoder) {
        this.userMapper = userMapper;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void register(String username, String password) {
        logger.debug("校验用户名是否重复");
        // TODO: userMapper.exist

        logger.debug("用户注册");
        User user = new User();
        user.setUsername(username);
        user.setPassword(passwordEncoder.encode(password));
        // TODO: userMapper.insert
    }
}
