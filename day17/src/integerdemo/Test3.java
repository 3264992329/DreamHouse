package integerdemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Test3 {
    public Test3() throws ParseException {

    }


    public static void main(String[] args) throws ParseException {
        //JDK8
        LocalDate localDate = LocalDate.of(2002, 7, 31);
        LocalDate now = LocalDate.now();
        long between = ChronoUnit.DAYS.between(localDate, now);
        System.out.println(between);

        //JDK7
        String brithday1="2002-7-31";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        long current=System.currentTimeMillis();
        Date date=sdf.parse(brithday1);
        long brithday=date.getTime();
        long between1=(current-brithday)/1000/60/60/24;
        System.out.println(between1);
    }



}
