package test2;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class MyThread implements Runnable{
    Socket socket;
    public MyThread(Socket socket){
        this.socket=socket;
    }
    @Override
    public void run() {
        try {
            String name = UUID.randomUUID().toString().replace("-", "");
            File file = new File("C:\\Users\\86187\\Desktop\\University\\javaDM\\day34-INetworkProgramming\\src\\test2\\serverdir\\"+name+".png");
            //读取数据
            BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
            byte[] bytes=new byte[1024];
            int b;
            while ((b=bis.read(bytes))!=-1){
                bos.write(bytes,0,b);
            }

            //回写数据
            String str="读取成功";
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write(str);
            bw.newLine();
            bw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //断开传输通道
            if (socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
