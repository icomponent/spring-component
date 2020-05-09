package im.spent.passport.handler;

import im.spent.core.exception.InvalidArgumentException;
import im.spent.core.spec.HttpErrorResponse;
import im.spent.core.spec.HttpErrorType;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletResponse;

@RestControllerAdvice
public class HttpExceptionHandler {

    @ExceptionHandler(InvalidArgumentException.class)
    public HttpErrorResponse invalidArgumentExceptionHandler(InvalidArgumentException exception, HttpServletResponse response) {
        return this.error(HttpErrorType.INVALID_ARGUMENT, exception, response);
    }

    private HttpErrorResponse error(HttpErrorType type, RuntimeException exception, HttpServletResponse response) {
        response.setStatus(type.getCode());
        return new HttpErrorResponse(type.getValue(), exception.getMessage());
    }
}
