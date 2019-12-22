package club.yunzhi.springbootstarter.util;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;

/**
 * 数据工具类
 */
@Slf4j
public class DataUtils {

    /**
     * 基础字符集
     */
    private static final String BASE_STR = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    /**
     * 随机字符串
     *
     * @param length 数据长度
     * @return 固定长度随机字符串
     */
    public static String randomString(int length) {
        Random random = new Random();
        StringBuilder builder = new StringBuilder();

        log.debug("从基础字符集中随机获取字符");
        for (int i = 0; i < length; i++) {
            int num = random.nextInt(62);
            builder.append(BASE_STR.charAt(num));
        }

        return builder.toString();
    }
}
