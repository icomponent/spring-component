package club.icomponent.core.exception;

/**
 * 数据不完整异常
 */
public class DataIntegrityViolationException extends RuntimeException {

    public DataIntegrityViolationException(String message) {
        super(message);
    }
}
