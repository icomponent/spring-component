package im.spent.passport.transfer;

/**
 * 普通登录凭证
 */
public class CommonLoginCredentials {

    /**
     * 账户
     */
    private String account;

    /**
     * 密码
     */
    private String password;

    public CommonLoginCredentials() {
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}