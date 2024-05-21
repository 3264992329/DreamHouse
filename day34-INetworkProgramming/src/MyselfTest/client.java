package MyselfTest;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class client {
    static ArrayList<Socket> list=new ArrayList<>();
    public static void main(String[] args) throws IOException {
        //连接服务器
        Socket socket = new Socket("127.0.0.1", 10086);
        System.out.println("服务器连接成功");

        //界面
        System.out.println("=========欢迎来到徐涛的梦幻乐园=========");
        System.out.println("输入'1'用户登录");
        System.out.println("输入'2'用户注册");
        Scanner sc=new Scanner(System.in);
        int chose = sc.nextInt();
        switch (chose){
            case 1 -> login(socket);
            case 2 -> register();
            default -> System.out.println("没有这个选项");
        }


    }

    //注册
    private static void register() {

    }

    //登录
    private static void login(Socket socket) throws IOException {
        //用于存储读取的用户名密码数据
        StringBuilder sb=new StringBuilder();

        //输入用户名、密码
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名:");
        String username = sc.nextLine();
        System.out.println("请输入密码:");
        String password = sc.nextLine();

        //拼接用户名、密码
        sb.append(username).append("=").append(password);
        //向服务器端发送输入的用户名、密码
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        //1先写入提示操作
        bw.write("login");
        bw.newLine();
        bw.flush();
        //2再写入用户名、密码
        bw.write(sb.toString());
        bw.newLine();
        bw.flush();

        socket.shutdownOutput();

        //开始接收服务器端发送的消息
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String str = br.readLine();
        System.out.println(str);
        if (str.equals("1")){
            System.out.println("登录成功");

            //开启一条线程用来接收消息
            new Thread(new clientRunnable(socket)).start();
            talk2all(bw);

        }else if (str.equals("2")){
            System.out.println("密码错误");
        }else if (str.equals("3")){
            System.out.println("不存在该用户");
        }
    }

    //开启对话
    private static void talk2all(BufferedWriter bw) throws IOException {
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("输入你要说的话");
            String string = sc.nextLine();
            bw.write(string);
            bw.newLine();
            bw.flush();
        }
    }


}
