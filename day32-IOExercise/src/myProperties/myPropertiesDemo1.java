package myProperties;

import java.io.*;
import java.util.Properties;

public class myPropertiesDemo1 {
    public static void main(String[] args) throws IOException {
        Properties p=new Properties();
        p.put("aaa","123");
        p.put("bbb","123");
        p.put("ccc","123");

        FileOutputStream fos=new FileOutputStream("day32-IOExercise\\myProperties");
        p.store(fos,"test");
        fos.close();
    }
}
