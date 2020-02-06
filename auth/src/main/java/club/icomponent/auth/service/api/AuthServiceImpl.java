package club.icomponent.auth.service.api;

import club.icomponent.auth.mapper.UserMapper;
import club.icomponent.auth.properties.EncryptRSAProperties;
import club.icomponent.auth.service.AuthService;
import club.icomponent.common.data.auth.User;
import club.icomponent.common.transfer.auth.AuthToken;
import club.icomponent.core.exception.AuthenticationException;
import club.icomponent.core.exception.EntityNotFoundException;
import club.icomponent.core.util.JwtUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.security.PrivateKey;

@Service
public class AuthServiceImpl implements AuthService {

    private static final Logger logger = LoggerFactory.getLogger(AuthServiceImpl.class);

    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;
    private final EncryptRSAProperties encryptRSAProperties;

    public AuthServiceImpl(UserMapper userMapper, PasswordEncoder passwordEncoder, EncryptRSAProperties encryptRSAProperties) {
        this.userMapper = userMapper;
        this.passwordEncoder = passwordEncoder;
        this.encryptRSAProperties = encryptRSAProperties;
    }

    @Override
    public AuthToken login(String username, String password) {
        logger.debug("查询用户");
        User user = this.userMapper.selectUserByUsername(username).orElseThrow(() -> new EntityNotFoundException("用户不存在"));

        logger.debug("校验密码正确性");
        if (!user.getPassword().equals(passwordEncoder.encode(password))) {
            throw new AuthenticationException("密码错误");
        }

        logger.debug("获取私钥");
        PrivateKey privateKey = encryptRSAProperties.getPrivateKey();

        logger.debug("设置access_token过期时间为2小时");
        long accessTokenExpiration = 2 * 60 * 60 * 1000;

        logger.debug("签发含有用户id信息的access_token");
        String accessToken = JwtUtils.signRS256Jwt(privateKey, user.getId(), accessTokenExpiration);
        // 签发JWT token.
        // access_token 非对称加密 -> user + 2小时
        // refresh_token 对称加密 -> username + 30天

        logger.debug("构造token并返回");
        AuthToken token = new AuthToken();
        token.setAccessToken(accessToken);
        return token;
    }
}
