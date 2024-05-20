package test2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class server {


    public static void main(String[] args) throws IOException {
        ThreadPoolExecutor pool=new ThreadPoolExecutor(
                3,
                16,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(2)
        );

        ServerSocket ss = new ServerSocket(10086);

        while (true){
            //等待链接
            Socket socket = ss.accept();
            MyThread myThread = new MyThread(socket);
            pool.submit(myThread);
        }

    }
}
