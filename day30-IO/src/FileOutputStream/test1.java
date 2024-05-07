package FileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class test1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream=new FileOutputStream("day30-IO\\src\\abc.txt");
        fileOutputStream.write(96);
        fileOutputStream.close();
    }
}
