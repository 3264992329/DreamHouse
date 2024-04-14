package jdk7demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormateDemo3 {
    public static void main(String[] args) throws ParseException {
        //活动时间 2023-11-11 00:00:00
        //结束时间 2023-11-11 00:10:00

        //小贾下单时间 2023-11-11 00:01:00
        //小徐下单时间 2023-11-11 00:11:00

        String start="2023-11-11 00:00:00";
        String end="2023-11-11 00:10:00";

        String jia="2023-11-11 00:01:00";
        String xu="2023-11-11 00:11:00";

        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1=sdf1.parse(start);
        Date d2 = sdf1.parse(end);
        Date d3 = sdf1.parse(jia);
        Date d4=sdf1.parse(xu);

        if (d1.getTime()<=d3.getTime()&&d3.getTime()<=d2.getTime()){
            System.out.println("小贾买到了");
        }else if(d1.getTime()>d3.getTime()||d3.getTime()>d2.getTime()){
            System.out.println("小贾没买到");
        }

        if (d1.getTime()<=d4.getTime()&&d4.getTime()<=d2.getTime()){
            System.out.println("小徐买到了");
        }else if(d1.getTime()>d4.getTime()||d4.getTime()>d2.getTime()){
            System.out.println("小徐没买到");
        }



    }
}
