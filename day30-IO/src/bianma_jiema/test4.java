package bianma_jiema;

import java.io.FileWriter;
import java.io.IOException;

public class test4 {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("day30-IO\\src\\ghi.txt",true);
        String str="–ÏÃŒ «¥ÛÀß±∆!";
        fw.write(str,0,2);
        char[] ch={'x','¿≤','∞°'};
        fw.write(ch);
        fw.write(ch,1,2);
        fw.close();
    }
}
