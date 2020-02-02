package club.icomponent.core.exception;

/**
 * 数据验证异常
 */
public class DataValidationException extends RuntimeException {

    public DataValidationException(String message) {
        super(message);
    }
}
