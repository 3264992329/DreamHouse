package demo2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class test1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\86187\\Desktop\\ด๓ัง\\javaDM\\day31-IO-2\\src\\exe1.txt"));
        ArrayList<String> list=new ArrayList<>();
        String b;
        while ((b=br.readLine())!=null){
            list.add(b);
        }
        System.out.println(list);
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int i1=Integer.parseInt(o1.split("\\.")[0]);
                int i2=Integer.parseInt(o2.split("\\.")[0]);
                return i1-i2;
            }
        });
        System.out.println(list);
        br.close();
    }
}
