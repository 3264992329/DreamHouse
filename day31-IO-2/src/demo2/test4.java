package demo2;

import java.io.*;
import java.nio.charset.Charset;

public class test4 {
    public static void main(String[] args) throws IOException {
        /*InputStreamReader isr=new InputStreamReader(new FileInputStream("C:\\Users\\86187\\Desktop\\大学\\javaDM\\day31-IO-2\\src\\abc.txt"));
        int b;
        while ((b=isr.read())!=-1){
            System.out.print((char)b);
        }
        isr.close();*/
        FileReader fr=new FileReader("C:\\Users\\86187\\Desktop\\大学\\javaDM\\day31-IO-2\\src\\abc.txt", Charset.forName("GBK"));
        int b;
        while ((b=fr.read())!=-1){
            System.out.print((char)b);
        }
        fr.close();
    }
}
