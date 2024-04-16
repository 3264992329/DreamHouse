package integerdemo;

import java.time.LocalDate;
import java.util.Date;

public class Test4 {
    public static void main(String[] args) {
        LocalDate ld=LocalDate.of(2002,3,1);
        LocalDate minus = ld.minusDays(1);
        System.out.println(minus);

        System.out.println(!ld.isLeapYear());
    }
}
