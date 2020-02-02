package club.icomponent.auth.service.api;

import club.icomponent.auth.mapper.UserMapper;
import club.icomponent.auth.service.AuthService;
import club.icomponent.common.data.auth.User;
import club.icomponent.common.transfer.auth.AuthToken;
import club.icomponent.common.transfer.auth.CommonCredentials;
import club.icomponent.core.exception.AuthenticationException;
import club.icomponent.core.exception.EntityNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    private static final Logger logger = LoggerFactory.getLogger(AuthServiceImpl.class);

    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;

    public AuthServiceImpl(UserMapper userMapper, PasswordEncoder passwordEncoder) {
        this.userMapper = userMapper;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public AuthToken login(CommonCredentials credentials) {
        logger.debug("获取用户名密码");
        String username = credentials.getUsername();
        String password = credentials.getPassword();

        logger.debug("查询");
        User user = this.userMapper.selectUserByUsername(username).orElseThrow(() -> new EntityNotFoundException("用户不存在"));

        logger.debug("校验密码正确性");
        if (!user.getPassword().equals(passwordEncoder.encode(password))) {
            throw new AuthenticationException("密码错误");
        }

        // 签发JWT token.
        // access_token 非对称加密 -> user + role + 2小时
        // refresh_token 对称加密 -> username + 7天
        return null;
    }
}
