package jdk8demo;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdDemo1 {
    public static void main(String[] args) {
        //获取所有时区
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds.size());
        System.out.println(zoneIds);

        //获取系统当前时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        //获取指定时区
        ZoneId zoneId1 = ZoneId.of("America/El_Salvador");
        System.out.println(zoneId1);
    }
}
