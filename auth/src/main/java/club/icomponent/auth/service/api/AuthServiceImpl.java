package club.icomponent.auth.service.api;

import club.icomponent.auth.mapper.UserMapper;
import club.icomponent.auth.service.AuthService;
import club.icomponent.common.auth.User;
import club.icomponent.common.transfer.auth.TraditionalUser;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    private final UserMapper userMapper;

    public AuthServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public String login(TraditionalUser traditionalUser) {
        User user = userMapper.selectUserByUsername(traditionalUser.getUsername());
        if (user == null) {
            // 用户不存在，抛出 401 异常
        }
        if (!user.getPassword().equals(traditionalUser.getPassword())) {
            // 密码错误，抛出 401 异常
        }
        // 签发 JWT 认证信息
        return null;
    }
}
