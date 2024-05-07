package FileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class test2 {
    public static void main(String[] args) throws IOException {
        byte[] bytes={97,98,99,100,101,102};
        FileOutputStream fileOutputStream=new FileOutputStream("day30-IO\\src\\abc.txt");
        //fileOutputStream.write(bytes);
        fileOutputStream.write(bytes,2,3);
    }
}
