package FileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class test3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream=new FileOutputStream("day30-IO\\src\\abc.txt",true);
        String s="aaaasdadff";
        byte[] bytes = s.getBytes();
        fileOutputStream.write(bytes);

        String str="\r\n";
        byte[] bytes1 = str.getBytes();
        fileOutputStream.write(bytes1);

        String s1="123456";
        byte[] bytes2 = s1.getBytes();
        fileOutputStream.write(bytes2);

        fileOutputStream.close();

        //ะ๘ะด
        /*FileOutputStream fileOutputStream1=new FileOutputStream("day30-IO\\src\\FileputStream\\abc.txt",true);
        String s2="xuxie";
        byte[] bytes3 = s2.getBytes();
        fileOutputStream1.write(bytes3);

        fileOutputStream1.close();*/
    }
}
