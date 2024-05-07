package FIleInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class test3 {
    public static void main(String[] args) throws IOException {

        long l = System.currentTimeMillis();

        FileInputStream come=new FileInputStream("day30-IO\\src\\abc.txt");
        FileOutputStream go=new FileOutputStream("day30-IO\\src\\def.txt",true);

        int b;
        while ((b=come.read())!=-1){
            System.out.println(b);
            go.write(b);
        }

        come.close();
        go.close();

        long l1 = System.currentTimeMillis();

        long consult=l1-l;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyƒÍMM‘¬dd»’ HH:mm:ss");
        String format = simpleDateFormat.format(consult);
        System.out.println(format);
    }
}
