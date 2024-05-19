package TCPdemo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10086);
        Socket socket = serverSocket.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        //InputStreamReader isr = new InputStreamReader(socket.getInputStream());
        String b;
        while ((b=br.readLine())!=null){
            System.out.println(b);
        }

        socket.close();
        serverSocket.close();
    }
}
