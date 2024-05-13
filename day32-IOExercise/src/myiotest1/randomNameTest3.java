package myiotest1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Random;

public class randomNameTest3 {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\86187\\Desktop\\fakeName.txt");
        BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        //????????????????????
        ArrayList<String> list=new ArrayList<>();
        String b;
        while ((b= br.readLine())!=null){
            list.add(b);
        }
        //????????????,????????3
        int i = Integer.parseInt(list.get(0));
        if (i==3){
            System.out.println("????-??-23");
            i++;
            list.set(0,i+"");
        }else {
            //???3???????,????+1
            Random rd=new Random();
            int t=rd.nextInt(list.size())+1;
            System.out.println(list.get(t));
            i++;
            list.set(0,i+"");
        }
        //???????????????????
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\86187\\Desktop\\fakeName.txt")));
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }
}
