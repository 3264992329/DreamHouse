package demo2;

import java.io.*;

public class test6_转换流练习 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\86187\\Desktop\\大学\\javaDM\\day31-IO-2\\src\\exe1.txt")));
        String b;
        while ((b=bf.readLine())!=null){
            System.out.print(b);
        }
        bf.close();

    }
}
