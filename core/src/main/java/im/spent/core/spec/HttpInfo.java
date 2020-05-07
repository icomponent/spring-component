package im.spent.core.spec;

/**
 * HTTP 状态码
 */
public class HttpInfo {

    public static final HttpInfo SUCCESS = new HttpInfo("000000", "SUCCESS");

    private String code;

    private String message;

    public HttpInfo(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
