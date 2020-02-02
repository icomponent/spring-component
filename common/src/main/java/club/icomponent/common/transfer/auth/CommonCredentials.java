package club.icomponent.common.transfer.auth;

/**
 * 普通登录凭证
 */
public class CommonCredentials {

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
}
