package im.spent.core.spec;

/**
 * Http 错误响应类型
 */
public class HttpErrorResponse {

    private String status;

    private String message;

    public HttpErrorResponse() {
    }

    public HttpErrorResponse(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
