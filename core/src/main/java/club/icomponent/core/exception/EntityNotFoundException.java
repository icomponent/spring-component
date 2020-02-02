package club.icomponent.core.exception;

/**
 * 实体找不到异常
 */
public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException(String message) {
        super(message);
    }
}
