package demo2;

import java.io.*;

public class test6_ת������ϰ {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\86187\\Desktop\\��ѧ\\javaDM\\day31-IO-2\\src\\exe1.txt")));
        String b;
        while ((b=bf.readLine())!=null){
            System.out.print(b);
        }
        bf.close();

    }
}
