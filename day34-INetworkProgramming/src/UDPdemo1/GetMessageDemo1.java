package UDPdemo1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class GetMessageDemo1 {
    public static void main(String[] args) throws IOException {
        //创建接收对象
        DatagramSocket ds = new DatagramSocket(10086);

        //接收的包裹
        byte[] bytes = new byte[1024];
        int len = bytes.length;
        DatagramPacket dp = new DatagramPacket(bytes,len);
        ds.receive(dp);

        //解析数据
        byte[] data = dp.getData();
        InetAddress address = dp.getAddress();
        int port = dp.getPort();
        int length = dp.getLength();
        System.out.println("接收到的数据是"+new String(data,0,length));
        System.out.println("发送的地址为"+address+"发送端口为:"+port);

        ds.close();
    }
}
