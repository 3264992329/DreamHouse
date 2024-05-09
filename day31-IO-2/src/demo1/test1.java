package demo1;

import java.io.*;

public class test1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\86187\\Desktop\\大学\\javaDM\\day31-IO-2\\src\\ghi.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\86187\\Desktop\\大学\\javaDM\\day31-IO-2\\src\\abc.txt"));

        String b;
        while ((b=br.readLine())!=null){
            System.out.println(b);
            bw.write(b);
            bw.newLine();
        }
        br.close();
        bw.close();

    }
}
