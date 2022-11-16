package com.fit2cloud.common.utils;

import org.apache.commons.lang3.time.DateUtils;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * @author jianneng
 * @date 2022/10/11 16:46
 **/
public class DateUtil extends DateUtils {
    public static final String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
    public static final String YYYY_MM_DD_HH_MM = "yyyy-MM-dd HH:mm";
    public static final String YYYY_MM_DD_HH = "yyyy-MM-dd HH";
    public static final String YYYY_MM_DD = "yyyy-MM-dd";
    /**
     * 获取当前时间,精确到秒
     * @return
     */
    public static LocalDateTime getSyncTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(YYYY_MM_DD_HH_MM_SS);
        return LocalDateTime.parse(now.format(dateTimeFormatter), dateTimeFormatter);
    }

    /**
     * 获取过去n个小时的时间戳
     * @param n
     * @return
     */
    public static Long getBeforeHourTime(int n) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, calendar.get(Calendar.HOUR_OF_DAY) - n);
        return calendar.getTime().getTime();
    }

    public static String dateToString(long l, String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format == null ?YYYY_MM_DD_HH_MM_SS:format);
        return dateFormat.format(new Date(l));
    }

    /**
     * 获取过去n分钟的时间戳
     * @param n
     * @return
     */
    public static Long getBeforeMTime(int n) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MINUTE, calendar.get(Calendar.MINUTE) - n);
        return calendar.getTime().getTime();
    }

    /**
     * 2022-01-01T00:00:00+08:00
     * @param timestamp
     * @return
     */
    public static String getISO8601TimestampFromDateStr(String timestamp){
        java.time.format.DateTimeFormatter dtf1 = java.time.format.DateTimeFormatter.ofPattern(YYYY_MM_DD_HH_MM_SS);
        LocalDateTime ldt = LocalDateTime.parse(timestamp,dtf1);
        ZoneOffset offset = ZoneOffset.of("+08:00");
        OffsetDateTime date = OffsetDateTime.of(ldt ,offset);
        java.time.format.DateTimeFormatter dtf2 = java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX");

        return date.format(dtf2 );
    }
    public static void main(String[] args) {

        System.out.println(getISO8601TimestampFromDateStr(dateToString(1667528700000L,null)));
    }

}