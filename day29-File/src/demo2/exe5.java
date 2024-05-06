package demo2;

import java.io.File;

public class exe5 {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\86187\\Desktop\\ฮารว");
        System.out.println(FileSize(file)/1024/1024/1024+"GB");
    }

    public static long FileSize(File file) {
        File[] files = file.listFiles();
        long len=0;
        for (File file1 : files) {
            if (file1.isFile()){
                len=len+file1.length();
            }else {
                len=len+FileSize(file1);
            }
        }
        return len;
    }
}
