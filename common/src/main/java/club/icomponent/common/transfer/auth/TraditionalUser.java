package club.icomponent.common.transfer.auth;

/**
 * 传统用户登录信息
 */
public class TraditionalUser {

    private String username;

    private String password;

    public TraditionalUser() {
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
