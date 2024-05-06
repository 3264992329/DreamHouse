package demo2;

import java.io.File;
import java.io.IOException;

public class exe1 {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\86187\\Desktop\\123\\aaa\\a.txt");
        boolean newFile = file.createNewFile();
        System.out.println(newFile);
    }
}
