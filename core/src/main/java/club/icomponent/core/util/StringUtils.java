package club.icomponent.core.util;

import club.icomponent.core.lang.Nullable;

/**
 * 字符串工具类
 */
public class StringUtils {

    /**
     * 判断字符串是否为空
     */
    public static boolean isEmpty(@Nullable String str) {
        return (str == null || "".equals(str));
    }
}
