package MyPrintStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class PrintSteamDemo1 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintStream ps=new PrintStream(new FileOutputStream("C:\\Users\\86187\\Desktop\\��ѧ\\javaDM\\day31-IO-2\\src\\exe1.txt"),true,"UTF-8");
        ps.println("aaa");//�Զ�ˢ��+�Զ�����
        ps.print(true);
        ps.printf("%s ������ %s","����","��ǿ");
        ps.close();
    }
}
