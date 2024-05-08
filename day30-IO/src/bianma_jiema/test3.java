package bianma_jiema;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class test3 {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("day30-IO\\src\\ghi.txt");
        char[] b=new char[3];
        int t;
        while ((t=fr.read(b))!=-1){
            System.out.println(new String(b,0,t));
        }
        fr.close();
    }
}
