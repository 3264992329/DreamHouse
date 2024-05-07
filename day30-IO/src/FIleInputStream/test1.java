package FIleInputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class test1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream=new FileInputStream("day30-IO\\src\\abc.txt");
        int read = fileInputStream.read();
        System.out.println((char) read);

        fileInputStream.close();
    }
}
