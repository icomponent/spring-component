package club.icomponent.auth.service;

import club.icomponent.common.transfer.auth.login.AuthToken;
import club.icomponent.common.transfer.auth.login.CommonCredentials;

/**
 * 用户认证服务
 */
public interface AuthService {

    /**
     * 普通登录方法
     * @param credentials 普通登录凭证
     * @return 认证令牌
     */
    AuthToken login(CommonCredentials credentials);
}
