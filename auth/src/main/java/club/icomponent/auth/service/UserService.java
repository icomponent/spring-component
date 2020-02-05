package club.icomponent.auth.service;

/**
 * 用户服务
 */
public interface UserService {

    /**
     * 用户注册
     * @param username 用户名
     * @param password 密码
     */
    void register(String username,
                  String password);
}
