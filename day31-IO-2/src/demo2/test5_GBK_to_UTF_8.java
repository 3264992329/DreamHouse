package demo2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class test5_GBK_to_UTF_8 {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("C:\\Users\\86187\\Desktop\\大学\\javaDM\\day31-IO-2\\src\\abc.txt", Charset.forName("UTF-8"));
        FileWriter fw=new FileWriter("C:\\Users\\86187\\Desktop\\大学\\javaDM\\day31-IO-2\\src\\ghi.txt",Charset.forName("GBK"));
        int b;
        while ((b= fr.read())!=-1){
            fw.write((char)b);
        }
        fw.close();
        fr.close();
    }
}
