package MyselfTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class clientRunnable implements Runnable{
    Socket socket;
    public clientRunnable(Socket socket) {
        this.socket=socket;
    }

    @Override
    public void run() {
        while (true){
            try {
                //接收服务器发送过来的消息
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String msg = br.readLine();
                System.out.println(msg);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
