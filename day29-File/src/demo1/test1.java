package demo1;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test1 {
    public static void main(String[] args) {
        //һ
        String str="C:\\Users\\86187\\Desktop\\123\\�½��ı��ĵ�.txt";
        File f1=new File(str);
        System.out.println(f1);

        //��
        String parent="C:\\Users\\86187\\Desktop\\123";
        String kid="�½��ı��ĵ�.txt";
        File f2=new File(parent,kid);
        System.out.println(f2);

        //��
        File parent2=new File("C:\\Users\\86187\\Desktop\\123");
        File f3=new File(parent2,kid);
        System.out.println(f3);

        System.out.println(f3.exists());
        long l = f3.lastModified();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy��MM��dd��");
        Date d=new Date(l);
        String format = simpleDateFormat.format(d);
        System.out.println(format);
    }
}
