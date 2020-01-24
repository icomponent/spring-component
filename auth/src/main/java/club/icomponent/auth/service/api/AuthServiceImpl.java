package club.icomponent.auth.service.api;

import club.icomponent.auth.mapper.UserMapper;
import club.icomponent.auth.service.AuthService;
import club.icomponent.common.auth.User;
import club.icomponent.common.transfer.auth.TraditionalUser;
import club.icomponent.core.exception.AuthenticationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    private static final Logger logger = LoggerFactory.getLogger(AuthServiceImpl.class);

    private final UserMapper userMapper;

    public AuthServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public String login(TraditionalUser traditionalUser) {
        logger.debug("根据用户名查询用户");
        User user = userMapper.selectUserByUsername(traditionalUser.getUsername());
        final String message = "用户名或密码错误";

        if (user == null) {
            logger.debug("用户不存在，抛出认证异常");
            throw new AuthenticationException(message);
        }

        if (!user.getPassword().equals(traditionalUser.getPassword())) {
            logger.debug("密码错误，抛出认证异常");
            throw new AuthenticationException(message);
        }
        // 签发 JWT 认证信息
        return null;
    }
}
