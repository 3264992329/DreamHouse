package myiotest1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class randomNameTest1 {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\86187\\Desktop\\fakeName.txt");
        BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        ArrayList<String> list=new ArrayList<>();
        String b;
        while ((b=br.readLine())!=null){
            list.add(b);
        }
        Collections.shuffle(list);
        System.out.println(list.getFirst());
    }
}
