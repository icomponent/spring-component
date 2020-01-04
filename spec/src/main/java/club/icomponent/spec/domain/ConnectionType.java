package club.icomponent.spec.domain;

/**
 * 查询条件连接类型
 */
public enum ConnectionType {

    NONE("无连接", "NONE"),
    AND("与连接", "AND"),
    OR("或连接", "OR");

    /**
     * 连接名
     */
    private final String name;

    /**
     * 连接值
     */
    private final String value;

    ConnectionType(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}
