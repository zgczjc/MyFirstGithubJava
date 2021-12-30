package com.tt.app.util.datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间工具类2：采用simpledateformate获取时间
 * 少用
 *
 * @author tecZ
 * @date 2021-12-30
 */
public class DateTimeSimple {

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

    public static String getDateTime() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
        return sdf.format(date);
    }

    public static String getDate() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }

    public static String getDateTimePara(String format) {
        return new SimpleDateFormat(format).format(new Date());
    }
}
