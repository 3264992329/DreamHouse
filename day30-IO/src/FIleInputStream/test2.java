package FIleInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class test2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream=new FileInputStream("day30-IO\\src\\abc.txt");
        int b;
        while ((b=fileInputStream.read())!=-1){
            System.out.println(b);
        }
    }
}
