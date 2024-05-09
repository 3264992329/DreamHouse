package demo2;

import java.io.*;
import java.util.*;

public class test2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\86187\\Desktop\\大学\\javaDM\\day31-IO-2\\src\\exe1.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\86187\\Desktop\\大学\\javaDM\\day31-IO-2\\src\\ghi.txt"));

        ArrayList<String> list=new ArrayList<>();
        String b;
        while ((b=br.readLine())!=null){
            list.add(b);
        }
        TreeMap<Integer,String> map=new TreeMap<>();
        for (String s : list) {
            String[] str = s.split("\\.");
            map.put(Integer.parseInt(str[0]),str[1]);
        }
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            String value = entry.getValue();
            bw.write(value);
        }
        bw.close();
        br.close();
    }
}
