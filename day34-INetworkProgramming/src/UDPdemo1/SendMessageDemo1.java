package UDPdemo1;

import java.io.IOException;
import java.net.*;

public class SendMessageDemo1 {
    public static void main(String[] args) throws IOException {
        //创建DatagramSocket对象(快递公司)
        DatagramSocket ds = new DatagramSocket();

        //打包数据
        String str = "你是一坨大便";
        byte[] bytes = str.getBytes();
        InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,inetAddress,10086);

        //发送
        ds.send(dp);

        ds.close();

    }
}
