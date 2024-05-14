package myProperties;

import java.io.*;
import java.util.Properties;

public class myPropertiesDemo2 {
    public static void main(String[] args) throws IOException {
        Properties p=new Properties();
        BufferedReader br=new BufferedReader(new FileReader("day32-IOExercise\\myProperties"));
        //FileInputStream fis=new FileInputStream("day32-IOExercise\\myProperties");
        p.load(br);
        br.close();
        System.out.println(p);
    }
}
