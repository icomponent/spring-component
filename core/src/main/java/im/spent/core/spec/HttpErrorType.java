package im.spent.core.spec;

public enum HttpErrorType {

    INVALID_ARGUMENT(400, "INVALID_ARGUMENT");

    private Integer code;
    private String value;

    HttpErrorType(Integer code, String value) {
        this.code = code;
        this.value = value;
    }

    public Integer getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }
}
