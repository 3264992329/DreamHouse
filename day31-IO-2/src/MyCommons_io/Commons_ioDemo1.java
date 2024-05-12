package MyCommons_io;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Commons_ioDemo1 {
    public static void main(String[] args) throws IOException {
        //复制文件
        /*File scr=new File("C:\\Users\\86187\\Desktop\\abc.txt");
        File dest=new File("C:\\Users\\86187\\Desktop\\copy.txt");
        FileUtils.copyFile(scr,dest);*/
        //复制文件夹
       /* File scr1=new File("C:\\Users\\86187\\Desktop\\abc123");
        File dest1=new File("C:\\Users\\86187\\Desktop\\bbb");
        FileUtils.copyDirectory(scr1,dest1);*/

        File src2=new File("C:\\Users\\86187\\Desktop\\bbb");
        FileUtils.cleanDirectory(src2);
        FileUtils.deleteDirectory(src2);
    }
}
