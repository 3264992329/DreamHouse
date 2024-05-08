package bianma_jiema;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class test2 {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("day30-IO\\src\\ghi.txt");
        int b;
        while ((b=fr.read())!=-1){
            System.out.print((char) b);
        }
        fr.close();
    }
}
