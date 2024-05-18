package MyInetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo1 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("x-top");
        System.out.println(address);

        String hostAddress = address.getHostAddress();
        System.out.println(hostAddress);
        String hostName = address.getHostName();
        System.out.println(hostName);
    }
}
