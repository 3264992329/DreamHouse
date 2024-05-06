package demo2;

import java.io.File;

public class exe4 {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\86187\\Desktop\\123\\aaa");
        detectFiles(file);
    }

    public static void detectFiles(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()){
                file1.delete();
            }else {
                detectFiles(file1);
            }
        }
        //最后删除自己
        file.delete();
    }
}
