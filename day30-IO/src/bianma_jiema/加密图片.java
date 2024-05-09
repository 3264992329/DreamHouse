package bianma_jiema;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class 加密图片 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("C:\\Users\\86187\\Desktop\\大学\\javaDM\\day30-IO\\src\\a1.jpg");
        FileInputStream fis=new FileInputStream("C:\\Users\\86187\\Desktop\\大学\\javaDM\\day30-IO\\src\\a2.jpg");
        int b;
        while ((b=fis.read())!=-1){
            fos.write(b^2);
        }
    }
}
