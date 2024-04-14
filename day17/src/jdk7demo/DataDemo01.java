package jdk7demo;

import java.util.Date;
import java.util.Random;

public class DataDemo01 {
    public static void main(String[] args) {
        Date d1=new Date();
        Date d2=new Date(0L);
        System.out.println(d1);
        System.out.println(d2);

        System.out.println("-------------------");

        //设置时间原点后一年的时间
        Date d3=new Date(0L);
        long time=d3.getTime();
        time=time+1000L*60*60*24*365;
        d3.setTime(time);
        System.out.println(d3);

        System.out.println("-------------------");

        //比较两个时间的先后顺序
        Random r=new Random();
        Date d4=new Date(Math.abs(r.nextInt()));
        Date d5=new Date(Math.abs(r.nextInt()));
        long time1= d4.getTime();
        long time2= d5.getTime();
        System.out.println("时间1:"+time1);
        System.out.println("时间2:"+time2);
        if (time1>time2){
            System.out.println("时间1大于时间2");
        } else if (time1<time2) {
            System.out.println("时间2大于时间1");
        }else {
            System.out.println("两个时间相等");
        }
    }
}
