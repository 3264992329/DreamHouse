package MyPrintWrite;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriteDemo1 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw=new PrintWriter(new FileWriter("C:\\Users\\86187\\Desktop\\��ѧ\\javaDM\\day31-IO-2\\src\\exe1.txt"),true);
        pw.println("��1a");
        pw.print(true);
        pw.printf("%s������%s","֣����","����");
        pw.close();
    }
}
