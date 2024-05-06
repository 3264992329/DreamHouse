package demo1;

import java.io.File;
import java.io.IOException;

public class test3 {
    public static void main(String[] args) throws IOException {
        String str="C:\\Users\\86187\\Desktop\\123\\aaa.txt";
        File file=new File(str);
        boolean newFile = file.createNewFile();
        System.out.println(newFile);

        File file1=new File("C:\\Users\\86187\\Desktop\\123\\bbb\\vvv");
        boolean mkdir = file1.mkdir();
        System.out.println(mkdir);

        File file2=new File("C:\\Users\\86187\\Desktop\\123\\aaa\\bbb\\ccc\\ddd\\eee\\fff");
        boolean mkdirs = file2.mkdirs();
        System.out.println(mkdirs);
    }
}
