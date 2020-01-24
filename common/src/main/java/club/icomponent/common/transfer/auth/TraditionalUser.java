package club.icomponent.common.transfer.auth;

import club.icomponent.core.spec.Validation;
import club.icomponent.core.util.StringUtils;

/**
 * 传统用户登录信息
 */
public class TraditionalUser implements Validation {

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    public TraditionalUser() {
    }

    public TraditionalUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean valid() {
        return !StringUtils.isEmpty(this.username)
                && !StringUtils.isEmpty(this.password);
    }
}
