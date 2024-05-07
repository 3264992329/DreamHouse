package FIleInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class test5 {
    public static void main(String[] args) throws IOException {

        FileInputStream come=new FileInputStream("day30-IO\\src\\abc.txt");
        FileOutputStream go=new FileOutputStream("day30-IO\\src\\def.txt",true);

        try(come;go) {
            byte[] str=new byte[1024];
            int b;
            while ((b=come.read(str))!=-1){
                System.out.println(b);
                go.write(str,0,b);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
