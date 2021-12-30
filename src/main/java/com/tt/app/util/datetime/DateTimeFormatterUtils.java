package com.tt.app.util.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 时间工具类1：采用datetimeformatter获取时间
 * 总结：
 * 对比SimpleDateFormate,DateTimeFormatter 不但是不变对象，而且是线程安全的，不会存在更多垃圾回收
 * 而SimpleDateFormate不是线程安全的，使用的时候更多的是在方法内部创建局部变量
 * DateTimeFormatter可以只创建一个变量，到处引用
 *
 * @author tecZ
 * date 2021-12-30
 */
public class DateTimeFormatterUtils {

    /**
     * main测试
     */
    public static void main(String[] args) {
        System.out.println("当前日期时间为：" + getDateTime());
        System.out.println("当前日期为：" + getDate());
        String format = "yyyy/MM-dd&HH:mm=ss>SSS";
        System.out.println("当前日期为：" + getDateTimePara(format));
        System.out.println("当前日期为：" + getDateTimePara("HHmmSSS"));
    }

    /**
     * 获取当前日期时间
     * 格式1：yyyyMMddHHmmss
     * 格式2：yyyy/MM/dd HH:mm:ss
     * 格式3：yyyy年MM月dd日HH时mm分ss秒
     * 格式4：yyyy-MM-dd-HH-mm-ss
     *
     * @return
     */
    public static String getDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        return formatter.format(now);
    }

    /**
     * 获取当前日期时间
     * 格式1：yyyy-MM-dd
     * 格式2：yyyy/MM/dd
     * 格式3：yyyy年MM月dd日
     *
     * @return
     */
    public static String getDate() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return formatter.format(now);
    }

    /**
     * 获取需要格式的日期时间
     *
     * @param format 需要的格式
     * @return
     */
    public static String getDateTimePara(String format) {
        return DateTimeFormatter.ofPattern(format).format(LocalDateTime.now());
    }
}
