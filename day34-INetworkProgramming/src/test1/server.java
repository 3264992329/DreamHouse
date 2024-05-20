package test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10086);

        //等待客户端链接
        Socket socket = ss.accept();

        //读取用户信息
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String b;
        while ((b=br.readLine())!=null){
            System.out.println(b);
        }

        //回写数据
        OutputStream os = socket.getOutputStream();
        String str="你肌肉好大";
        os.write(str.getBytes());

        //断块链接
        socket.close();
        //关闭服务器
        ss.close();
    }
}
