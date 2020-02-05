package club.icomponent.core.util;

import club.icomponent.core.lang.Nullable;

import java.util.regex.Pattern;

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

    /**
     * 判断邮箱格式是否正确
     */
    public static boolean isEmail(@Nullable String email) {
        if (isEmpty(email)) {
            return false;
        }
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +  //part before @
                "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return Pattern.compile(regex).matcher(email).matches();
    }
}
