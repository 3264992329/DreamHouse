package jdk7demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormateDemo2 {
    public static void main(String[] args) throws ParseException {
        //将2000-11-31  用字符串表示 并转换为2000年11月31日
        String str="2000-11-31";
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
        Date d1=sdf1.parse(str);
        System.out.println(d1.getTime());
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年MM月dd日");
        String d2=sdf2.format(d1);
        System.out.println(d2);
    }
}
