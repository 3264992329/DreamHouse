package myiotest1;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class randomNameTest2 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list=new ArrayList<>();
        File file=new File("C:\\Users\\86187\\Desktop\\fakeName.txt");
        BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String b;
        int i=0;
        int gl=0;
        int by=0;
        while ((b=br.readLine())!=null){
            String sex=b.split("-")[1];
            if (i<10){
                if (sex.equals("ÄÐ")&&by<7){
                    list.add(b);
                    i++;
                    by++;
                }else if (sex.equals("Å®")&&gl<3){
                    list.add(b);
                    i++;
                    gl++;
                }
            }else {
                break;
            }
        }
        for (String s : list) {
            System.out.println(s);
        }
        br.close();
    }
}
