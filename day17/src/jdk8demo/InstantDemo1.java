package jdk8demo;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class InstantDemo1 {
    public static void main(String[] args) {
        //获取当前时间
        Instant now = Instant.now();
        System.out.println(now);

        System.out.println("-----------------------------------------------");
        //根据秒,毫秒,纳秒获取时间
        Instant instant1 = Instant.ofEpochMilli(300L);
        System.out.println(instant1);
        Instant instant2 = Instant.ofEpochSecond(3);
        System.out.println(instant2);
        Instant instant3 = Instant.ofEpochSecond(3, 3000000L);
        System.out.println(instant3);

        System.out.println("-----------------------------------------------");
        //指定时区
        ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(zonedDateTime);

        System.out.println("-----------------------------------------------");
        //判断
        Instant instant4 = Instant.ofEpochMilli(0L);
        Instant instant5 = Instant.ofEpochMilli(3000L);
        //isXxxx判断
        boolean before = instant4.isBefore(instant5);
        boolean after = instant5.isAfter(instant4);
        System.out.println(before+"  "+after);

        System.out.println("-----------------------------------------------");
        Instant instant = instant4.minusMillis(3000L);
        Instant instant6 = instant5.plusMillis(500000L);
        System.out.println(instant+"   "+instant6);

        System.out.println("-----------------------------------------------");
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss E a");
        String format = dtf1.format(time);
        System.out.println(format);

    }
}
