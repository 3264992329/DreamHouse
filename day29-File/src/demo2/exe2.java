package demo2;

import java.io.File;
import java.io.FileFilter;

public class exe2 {
    public static void main(String[] args) {
        String str="C:\\Users\\86187\\Desktop\\123\\aaa";
        System.out.println(yesORno(str));
    }
    public static boolean yesORno(String s){
        File file=new File(s);
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile() && pathname.getName().endsWith("ppt");
            }
        });
        if (files.length==0){
            return false;
        }else {
            return true;
        }

    }
}
