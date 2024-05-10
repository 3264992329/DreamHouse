package MyPrintStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class PrintSteamDemo1 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintStream ps=new PrintStream(new FileOutputStream("C:\\Users\\86187\\Desktop\\大学\\javaDM\\day31-IO-2\\src\\exe1.txt"),true,"UTF-8");
        ps.println("aaa");//自动刷新+自动换行
        ps.print(true);
        ps.printf("%s 爱上了 %s","阿珍","阿强");
        ps.close();
    }
}
