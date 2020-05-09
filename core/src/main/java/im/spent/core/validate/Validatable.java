package im.spent.core.validate;

import im.spent.core.exception.InvalidArgumentException;

/**
 * 数据验证接口 用于 transfer 对象校验
 */
public interface Validatable {

    void checkValid() throws InvalidArgumentException;
}
