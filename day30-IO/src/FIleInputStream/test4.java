package FIleInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class test4 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();

        FileInputStream come=new FileInputStream("day30-IO\\src\\abc.txt");
        FileOutputStream go=new FileOutputStream("day30-IO\\src\\def.txt",true);

        byte[] str=new byte[1024];
        int b;
        while ((b=come.read(str))!=-1){
            System.out.println(b);
            go.write(str,0,b);
        }



        come.close();
        go.close();

        long end = System.currentTimeMillis();

        long consult = end - start;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd天 HH小时mm分钟ss秒钟");
        String format = simpleDateFormat.format(consult);
        System.out.println(format);
        System.out.println(consult);

    }
}
