package im.spent.auth.common;

/**
 * 用户实体
 */
public class User {

    /** 用户id */
    private String id;

    /** 用户姓名 */
    private String name;

    /** 用户头像 */
    private String avatar;

    /** 邮箱 */
    private String email;

    /** 用户名 */
    private String username;

    /** 密码 */
    private String password;

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
