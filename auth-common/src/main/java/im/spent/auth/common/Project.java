package im.spent.auth.common;

/**
 * 项目实体
 */
public class Project {

    /** 项目id */
    private String id;

    /** 项目名称 */
    private String name;

    /** 项目地址 */
    private String url;

    /** 项目图片 */
    private String logo;

    public Project() {
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}
