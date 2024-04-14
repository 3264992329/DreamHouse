package jdk7demo;

import java.util.Calendar;
import java.util.Date;

public class CleadarDemo1 {
    public static void main(String[] args) {
        //获取日历对象
        //根据系统不同时区获取当前时间
        Calendar c1=Calendar.getInstance();
        System.out.println(c1);
        Date d=new Date(0L);
        c1.setTime(d);
        System.out.println(c1);

        //修改日期信息
        c1.set(Calendar.YEAR,2024);
        c1.set(Calendar.MONTH,4);
        c1.set(Calendar.DAY_OF_MONTH,14);
        c1.add(Calendar.MONTH,9);

        int year=c1.get(Calendar.YEAR);
        int month=c1.get(Calendar.MONTH)+1;
        int date=c1.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+"年"+month+"月"+date+"日");
    }
}
