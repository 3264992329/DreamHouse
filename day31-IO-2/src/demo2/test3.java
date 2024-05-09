package demo2;

import java.io.*;

public class test3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\86187\\Desktop\\大学\\javaDM\\day31-IO-2\\src\\ghi.txt"));

        String s = br.readLine();
        int i = Integer.parseInt(s);
        i++;
        if (i>3){
            System.out.println("免费使用已经超过三次,如还需继续使用请充值会员");
        }else {
            System.out.println("已经免费使用"+i+"次");
        }
        BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\86187\\Desktop\\大学\\javaDM\\day31-IO-2\\src\\ghi.txt"));
        bw.write(i+"");

        bw.close();
        br.close();
    }
}
