package demo2;

import java.io.*;

public class test3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\86187\\Desktop\\��ѧ\\javaDM\\day31-IO-2\\src\\ghi.txt"));

        String s = br.readLine();
        int i = Integer.parseInt(s);
        i++;
        if (i>3){
            System.out.println("���ʹ���Ѿ���������,�绹�����ʹ�����ֵ��Ա");
        }else {
            System.out.println("�Ѿ����ʹ��"+i+"��");
        }
        BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\86187\\Desktop\\��ѧ\\javaDM\\day31-IO-2\\src\\ghi.txt"));
        bw.write(i+"");

        bw.close();
        br.close();
    }
}
