package club.icomponent.spec.domain;

public enum ConnectionType {
    CONNECT("1", "1");

    private String name;
    private String type;

    ConnectionType(String name, String type) {
        this.name = name;
        this.type = type;
    }
}
