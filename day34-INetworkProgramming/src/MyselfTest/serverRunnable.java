package MyselfTest;

import java.io.*;
import java.net.Socket;
import java.util.Properties;


public class serverRunnable implements Runnable{
    Socket socket;
    Properties prop;
    public serverRunnable(Socket socket, Properties prop) {
        this.socket=socket;
        this.prop=prop;
    }

    @Override
    public void run() {
        try {
            //读取用户输入的用户名密码
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (true){
                String string = br.readLine();
                System.out.println(string);
                switch (string){
                    case "login" -> login(br);
                    case "register" -> System.out.println("用户选择注册");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void login(BufferedReader br) throws IOException {
        //第二次就读取用户消息
        String userinfo = br.readLine();
        String[] split = userinfo.split("=");
        String username = split[0];
        String password = split[1];
        if (prop.containsKey(username)){
            if (prop.get(username).equals(password)){
                writeMessage("1");

                //保存以登陆的对象
                client.list.add(socket);

                talk2all(br,username);

            }else {
                writeMessage("2");
            }
        }else {
            writeMessage("3");
        }

    }

    //开启对话
    private void talk2all(BufferedReader br,String username) throws IOException {
        while (true){
            String message = br.readLine();
            System.out.println(username+"发送过来"+message);

            //群发
            for (Socket socket1 : client.list) {
                writeMessage(socket1,username+"发送过来"+message);
            }
        }
    }

    private void writeMessage(String message) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write(message);
        bw.newLine();
        bw.flush();
    }

    private void writeMessage(Socket s,String message) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bw.write(message);
        bw.newLine();
        bw.flush();
    }
}
