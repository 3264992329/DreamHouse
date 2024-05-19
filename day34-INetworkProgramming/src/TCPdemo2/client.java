package TCPdemo2;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10086);
        Scanner sc=new Scanner(System.in);
        OutputStream os = socket.getOutputStream();
        //PrintWriter printWriter = new PrintWriter(socket.getOutputStream(),true);

        while (true){
            String string=sc.nextLine();
            String str=string+'\n';
            byte[] bytes = str.getBytes();
            os.write(bytes);
            //printWriter.println(str);
            if (str.equals("886")){
                break;
            }
        }

        sc.close();
        socket.close();
    }
}
