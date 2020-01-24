package club.icomponent.core.exception;

/**
 * 数据验证异常
 */
public class ValidationException extends RuntimeException {

    public ValidationException(String message) {
        super(message);
    }
}
