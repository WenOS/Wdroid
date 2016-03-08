package android.library.wdroid.common.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class W_VertifyUtil {

    /**
     * 验证邮编
     *
     * @param postcode
     * @return
     */
    public static boolean vertifyPostcode(String postcode) {
        String format = "\\p{Digit}{6}";
        // 验证邮编的正则表达式
        if (postcode.matches(format)) {
            return true;
            // 邮编合法，返回true
        } else {
            return false;
            // 邮编不合法，返回false
        }
    }

    /**
     * 验证网址Url是否正确
     *
     * @param str
     * @return
     */
    public static boolean vertifyIsUrl(String str) {
        String regex = "http(s)?://([\\w-]+\\.)+[\\w-]+(/[\\w- ./?%&=]*)?";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
