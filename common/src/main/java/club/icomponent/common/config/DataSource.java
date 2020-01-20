package club.icomponent.common.config;

/**
 * 数据源配置
 */
public class DataSource {

    /**
     * 数据库连接 url
     */
    private String url;

    /**
     * 数据库 用户名
     */
    private String username;

    /**
     * 数据库 密码
     */
    private String password;

    /**
     * 数据库迁移文件 路径
     */
    private String location;

    public DataSource() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
