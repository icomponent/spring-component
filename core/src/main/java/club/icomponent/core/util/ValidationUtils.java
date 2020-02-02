package club.icomponent.core.util;

import club.icomponent.core.exception.DataValidationException;
import club.icomponent.core.spec.Validation;

/**
 * 数据验证工具类
 */
public class ValidationUtils {

    /**
     * 数据验证
     * @param validation 验证对象
     */
    public static void validate(Validation validation) {
        boolean valid = validation.valid();
        if (!valid) {
            throw new DataValidationException(String.format("对象%s不合法", validation.getClass().getName()));
        }
    }
}
