package TCPdemo1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10086);
        Socket socket = serverSocket.accept();

        BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        int b;
        while ((b=is.read())!=-1){
            System.out.println((char) b);
        }

        is.close();
        socket.close();
    }
}
