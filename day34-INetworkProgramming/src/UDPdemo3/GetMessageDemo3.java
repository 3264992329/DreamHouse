package UDPdemo3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class GetMessageDemo3 {
    public static void main(String[] args) throws IOException {
        //创建接收对象
        MulticastSocket ms = new MulticastSocket(10000);
        InetAddress inetAddress = InetAddress.getByName("224.0.0.1");
        ms.joinGroup(inetAddress);

        byte[] bytes = new byte[1024];
        int len = bytes.length;
        DatagramPacket dp = new DatagramPacket(bytes,len);

        while (true) {
            //接收的包裹
            ms.receive(dp);

            //解析数据
            byte[] data = dp.getData();
            InetAddress address = dp.getAddress();
            int port = dp.getPort();
            int length = dp.getLength();
            System.out.println("接收到的数据是"+new String(data,0,length));
            System.out.println("发送的地址为"+address+"发送端口为:"+port);

            if (new String(data,0,length).equals("886")){
                break;
            }
        }

        ms.close();
    }
}
