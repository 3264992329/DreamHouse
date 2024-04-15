package jdk8demo;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitDemo1 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime birthday = LocalDateTime.of(2002, 7, 31, 16, 36, 6, 6);
        System.out.println(birthday);

        System.out.println("出生:"+ ChronoUnit.YEARS.between(birthday,now)+"年");
        System.out.println("出生"+ChronoUnit.MONTHS.between(birthday,now)+"月");
        System.out.println("出生"+ChronoUnit.DAYS.between(birthday,now)+"天");
    }
}
