package club.icomponent.auth.service;

import club.icomponent.common.transfer.auth.AuthToken;

/**
 * 用户认证服务
 */
public interface AuthService {

    /**
     * 普通登录方法
     * @param username 用户名
     * @param password 密码
     * @return 认证令牌
     */
    AuthToken login(String username,
                    String password);
}
