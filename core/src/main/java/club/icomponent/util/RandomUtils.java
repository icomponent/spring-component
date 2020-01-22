package club.icomponent.util;

import java.util.Random;

/**
 * 随机工具类
 */
public class RandomUtils {

    public static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static final String LOWER = "abcdefghijklmnopqrstuvwxyz";

    public static final String DIGIT = "0123456789";

    public static final String ALPHA_NUM = UPPER + LOWER + DIGIT;

    /**
     * 基于字符集生成随机长度字符串
     * @param length 字符串长度
     * @param characters 字符集
     * @return 随机字符串
     */
    public static String randomString(int length, String characters) {
        int size = characters.length();
        if (length <= 0 || size <= 0) {
            return "";
        }
        Random random = new Random();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(size);
            builder.append(characters.charAt(index));
        }
        return builder.toString();
    }
}
