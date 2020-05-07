package im.spent.core.spec;

import lombok.Builder;

/**
 * Http 响应类型
 * @param <T>
 */
@Builder
public class HttpResponse<T> {

    private String code;

    private String message;

    private T data;

    public HttpResponse() {
    }

    public static <T> HttpResponse<T> success(T data) {
        return new HttpResponseBuilder<T>()
                .code(HttpInfo.SUCCESS.getCode())
                .message(HttpInfo.SUCCESS.getMessage())
                .data(data).build();
    }
}
