package TCPdemo1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("10.110.99.98", 10086);

        OutputStream os = socket.getOutputStream();
        os.write("徐涛大帅逼".getBytes());

        os.close();
        socket.close();
    }
}
