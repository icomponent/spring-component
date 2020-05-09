package im.spent.core.exception;

/**
 * 非法参数异常
 */
public class InvalidArgumentException extends RuntimeException {

    public InvalidArgumentException(String message) {
        super(message);
    }
}
