package android.library.wdroid.common.utils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;


public class W_DateUtil {

    /**
     * Get  Curenter  Data By System-> 14
     *
     * @return
     */
    public static String getSysDate() {
        SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        return sDateFormat.format(new Date());
    }


    /**
     * 得到当前的日期,共10位
     * 返回格式：yyyy-MM-dd
     *
     * @return String
     */
    public static String getCurrentDate() {
        Date NowDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String currentDate = formatter.format(NowDate);
        return currentDate;
    }

    /**
     * 得到当前的年份
     * 返回格式:yyyy
     *
     * @return String
     */
    public static String getCurrentYear() {
        Date NowDate = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
        return formatter.format(NowDate);
    }

    /**
     * 得到当前的月份
     * 返回格式:MM
     *
     * @return String
     */
    public static String getCurrentMonth() {
        Date NowDate = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("MM");
        return formatter.format(NowDate);
    }

    /**
     * 得到当前的日期(天)
     * 返回格式:dd
     *
     * @return String
     */
    public static String getCurrentDay() {
        Date NowDate = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd");
        return formatter.format(NowDate);
    }


    /**
     * format Data like "yyyy-MM-dd"
     *
     * @param date
     * @return
     */
    public static String parseDate(Date date) {
        if (date != null) {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA)
                .format(date);
        } else {
            return "";
        }
    }


    /**
     * parse date using default pattern yyyy-MM-dd
     *
     * @param strDate
     * @return
     */
    public static final Date parseDate(String strDate) {
        Date date = null;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            date = dateFormat.parse(strDate);
            return date;
        } catch (Exception pe) {
            return null;
        }
    }


    /**
     * String->Timestamp
     *
     * @param str
     * @return
     */
    public static Timestamp strToTimestamp(String str) {
        return Timestamp.valueOf(str);
    }

    /**
     * String->imestamp
     *
     * @param str
     * @param format
     * @return
     */
    public static Timestamp strToTimestamp(String str, String format) {
        // "yyyy-MM-dd HH:mm:ss"
        SimpleDateFormat df1 = new SimpleDateFormat(format);
        Date date1 = new Date();
        try {
            date1 = df1.parse(str);
        } catch (ParseException e) {

            e.printStackTrace();
        }
        String time = df1.format(date1);
        // Timestamp ts = Timestamp.valueOf(time);
        return Timestamp.valueOf(time);
    }


    /**
     * Compare the difference between the data
     *
     * @param pattern
     * @param startDate
     * @param endDate
     * @return
     */
    public static String twoDateDistance(String pattern, Date startDate, Date endDate) {

        if (startDate == null || endDate == null) {
            return null;
        }
        long timeLong = endDate.getTime() - startDate.getTime();
        if (timeLong < 60 * 1000)
            return timeLong / 1000 + " 秒后";
        else if (timeLong < 60 * 60 * 1000) {
            timeLong = timeLong / 1000 / 60;
            return timeLong + " 分钟后";
        } else if (timeLong < 60 * 60 * 24 * 1000) {
            timeLong = timeLong / 60 / 60 / 1000;
            return timeLong + " 小时后";
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
            sdf.setTimeZone(TimeZone.getTimeZone("GMT+08:00"));
            return sdf.format(startDate);
        }
    }


}
