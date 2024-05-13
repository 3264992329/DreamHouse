package myiotest2;

import java.io.*;
import java.util.Scanner;

public class userinfo1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("day32-IOExercise\\UsernamePassword")));
        String s = br.readLine();
        //获取正确用户名
        String rightUsername = s.split("&")[0].split("=")[1];
        //获取正确密码
        String rightPassword = s.split("&")[1].split("=")[1];
        //获取计数器count
        int count = Integer.parseInt(s.split("&")[2].split("=")[1]);
        System.out.println(rightUsername+"-"+rightPassword);
        //用户输入账户密码输入
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入账号");
        String username=sc.nextLine();
        System.out.println("请输入密码");
        String password=sc.nextLine();
        //判断密码账户是否正确
        if (password.equals(rightPassword)&&username.equals(rightUsername)&&count<=3){
            System.out.println("登录成功");
            count=0;
            //将计数器count的值置零
            BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("day32-IOExercise\\UsernamePassword")));
            bw.write("username="+rightPassword+"&"+"password="+rightPassword+"&"+"count="+count);
            bw.close();
        }else {
            if (count>=3){
                System.out.println("登录次数已经用完,不能登录");
            }else {
                count++;
                int a=3-count;
                System.out.println("登录失败,剩余"+a+"次机会");
                //将计数器count的值输入文本
                BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("day32-IOExercise\\UsernamePassword")));
                bw.write("username="+rightPassword+"&"+"password="+rightPassword+"&"+"count="+count);
                bw.close();
            }
        }
        br.close();
    }
}
