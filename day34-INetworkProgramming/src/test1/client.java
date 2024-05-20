package test1;

import java.io.*;
import java.net.Socket;

public class client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10086);

        String str="徐涛,你好帅啊";
        OutputStream os = socket.getOutputStream();
        os.write(str.getBytes());

        socket.shutdownOutput();

        //读取用户信息
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String b;
        while ((b=br.readLine())!=null){
            System.out.println(b);
        }

        //释放资源
        socket.close();
    }
}
