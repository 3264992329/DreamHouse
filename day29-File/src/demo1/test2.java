package demo1;

import java.io.File;

public class test2 {
    public static void main(String[] args) {
        String str="C:\\Users\\86187\\Desktop\\123\\新建文本文档.txt";
        File f1=new File(str);
        System.out.println(f1);

        System.out.println("-----isDirectory()---");
        System.out.println(f1.isDirectory());
        System.out.println("-----isFile()---");
        System.out.println(f1.isFile());
        System.out.println("-----exists()---");
        System.out.println(f1.exists());

        System.out.println("-----length()---");
        System.out.println(f1.length());
        System.out.println("-----getAbsolutePath()---");
        System.out.println(f1.getAbsolutePath());
        System.out.println("-----getName()---");
        System.out.println(f1.getName());
        System.out.println("-----getAbsoluteFile()---");
        System.out.println(f1.getAbsoluteFile());
        System.out.println("-----getPath()---");
        System.out.println(f1.getPath());
    }
}
