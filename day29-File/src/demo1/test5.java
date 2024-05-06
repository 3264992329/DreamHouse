package demo1;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;

public class test5 {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\86187\\Desktop\\123");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }
        System.out.println("-----------------------------");
        File[] files1 = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile()&&pathname.getName().endsWith(".txt");
            }
        });
        System.out.println(Arrays.toString(files1));
        System.out.println("-----------------------------");
        File[] files2 = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File file1 = new File(dir, name);
                return true;
            }
        });
        System.out.println(Arrays.toString(files2));
    }
}
