package club.icomponent.common.transfer.auth.register;

import club.icomponent.core.spec.Validation;
import club.icomponent.core.util.StringUtils;

/**
 * 用户注册信息
 */
public class RegisterInformation implements Validation {

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 验证码
     */
    private String code;

    public RegisterInformation() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean valid() {
        return !StringUtils.isEmpty(username)
                && !StringUtils.isEmpty(password)
                && StringUtils.isEmail(email)
                && !StringUtils.isEmpty(code);
    }
}
