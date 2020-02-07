package club.icomponent.common.transfer.auth;

import club.icomponent.core.spec.Validation;
import club.icomponent.core.util.StringUtils;

/**
 * 普通登录凭证
 */
public class CommonCredentials implements Validation {

    /** 用户名 */
    private String username;

    /** 密码 */
    private String password;

    public CommonCredentials() {
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
        return !StringUtils.isEmpty(username)
                && !StringUtils.isEmpty(password);
    }
}
