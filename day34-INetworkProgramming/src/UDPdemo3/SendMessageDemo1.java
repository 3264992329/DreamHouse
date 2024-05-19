package UDPdemo3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class SendMessageDemo1 {
    public static void main(String[] args) throws IOException {
        //创建DatagramSocket对象(快递公司)
        DatagramSocket ds = new DatagramSocket();

        Scanner sc=new Scanner(System.in);
        //打包数据
        while (true){
            String str = sc.nextLine();
            byte[] bytes = str.getBytes();
            InetAddress inetAddress = InetAddress.getByName("224.0.0.1");
            DatagramPacket dp = new DatagramPacket(bytes,bytes.length,inetAddress,10000);
            if (str.equals("886")){
                ds.send(dp);
                break;
            }else {
                //发送
                ds.send(dp);
            }
        }

        ds.close();

    }
}
