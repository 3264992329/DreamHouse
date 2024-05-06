package demo2;

import java.io.File;
import java.io.FileFilter;

public class exe3 {
    public static void main(String[] args) {
        File file=new File("C:\\");
        findWord(file);
    }

    public static void findWord(File file) {
        File[] files = file.listFiles();

        if (files!=null){
            for (File file1 : files) {
                if (file1.isFile()){
                    if (file1.isFile()&&file1.getName().endsWith("docx")){
                        System.out.println(file1);
                    }
                }else {
                    findWord(file1);
                }
            }
        }

    }
}
