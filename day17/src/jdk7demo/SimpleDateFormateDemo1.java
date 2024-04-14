package jdk7demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormateDemo1 {
    public static void main(String[] args) throws ParseException {
        formate1();

        String str="2024:4:14 16:04:56";
        //解析  关键字:
        SimpleDateFormat sdf3=new SimpleDateFormat("yyy:MM:dd HH:mm:ss");
        Date d1=sdf3.parse(str);
        System.out.println(d1.getTime());
    }

    private static void formate1() {
        //利用空参构造创建SimpleDateFormat
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date d1=new Date(0L);
        String str1=sdf1.format(d1);
        System.out.println(str1);

        //利用带参构造创建SimpleDateFormate对象
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 EE");
        String str2= sdf2.format(d1);
        System.out.println(str2);
    }
}
