package MyselfTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;

public class server {
    public static void main(String[] args) throws IOException {
        //客户端连接
        ServerSocket ss = new ServerSocket(10086);

        //读取客户端发送过来的消息
        Properties prop=new Properties();
        FileInputStream fis = new FileInputStream("day34-INetworkProgramming\\src\\MyselfTest\\username_password.txt");
        prop.load(fis);
        fis.close();

        while (true){
            Socket socket = ss.accept();
            System.out.println("有客户端连接");
            new Thread(new serverRunnable(socket,prop)).start();
        }

    }
}
