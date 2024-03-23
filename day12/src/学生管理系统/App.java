package 学生管理系统;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import static 学生管理系统.StudentSystem.StudentSystemControl;

public class App {
    public static void main(String[] args) {

        //创建集合
        ArrayList<User> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        User us1=new User("111111","121212","131313","181818");
        User us2=new User("222222","131313","232323","131313");
        User us3=new User("333333","141414","333333","161616");
        list.add(us1);
        list.add(us2);
        list.add(us3);
        //登录首页
        while (true){

            System.out.print("登录输入1   ||");
            System.out.print("注册输入2   ||");
            System.out.print("忘记密码输入3   ||");
            System.out.println("不存在该功能");

            int t=sc.nextInt();
            loop1:switch (t){
                //登录---------------------------------------------
                case 1-> {
                    System.out.println("请输入用户名:");
                    String username= sc.next();
                    System.out.println("请输入密码:");
                    String password= sc.next();
                    dengLu(username,password,list);
                }
                //注册--------------------------------------------
                case 2->{
                    User US=new User();
                    System.out.println("注册用户名");

                    //判断注册的用户名长度是否非法
                    loop4:while (true) {
                        String username= sc.next();
                        US.setUserName(username);
                        if (username.length()==6){
                            break loop4;
                        }else {
                            System.out.println("输入用户名长度非法,用户名长度限制6位");
                        }
                    }


                    //初次注册判断该用户名是否已经存在
                    for (int i = 0; i < list.size(); i++) {
                        User us=list.get(i);
                        if(us.getUserName().equals(US.getUserName())){
                            System.out.println("该用户已存在");
                            break loop1;
                        }
                    }

                    String password;
                    String remakePassword;
                    loop2:while (true){

                        //判断注册密码长度是否非法
                        loop3:while (true) {
                            System.out.println("注册密码");
                            password= sc.next();
                            if (password.length()==6){
                                break loop3;
                            }else {
                                System.out.println("输入密码长度非法,密码长度限制6位");
                            }
                        }

                        //再次确认密码
                        System.out.println("再次确认密码");
                        remakePassword=sc.next();
                        if(!remakePassword.equals(password)){
                            System.out.println("两次密码不一致,请重新输入:");
                            continue;
                        }else {
                            US.setPassWord(password);
                            break loop2;
                        }

                    }

                    System.out.println("注册身份证");
                    loop5:while (true){
                        String personId= sc.next();
                        US.setPersonId(personId);
                        if (personId.length()==6){
                            break loop5;
                        }else {
                            System.out.println("输入身份证长度非法,身份证长度限制6位");
                        }
                    }

                    System.out.println("注册手机号");
                    loop6:while (true){
                        String phoneNumber=sc.next();
                        US.setPhoneNumber(phoneNumber);
                        if (phoneNumber.length()==6){
                            break loop6;
                        }else {
                            System.out.println("输入手机号长度非法,手机号长度限制6位");
                        }
                    }

                    zhuCe(US,remakePassword,list);
                }

                //忘记密码----------------------------------------------
                case 3->forGot();

                //其他-------------------------------------------------
                default -> {
                    System.out.println("不存在该功能");
                }
            }

        }
    }

    //--------------------------------------------------------
    //登录-----------------------------------------------------
    public static void dengLu(String username,String password,ArrayList<User> list) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getUserName().equals(username)){
                if (list.get(i).getPassWord().equals(password)){
                    System.out.println("登陆成功!");
                    StudentSystemControl();
                    return;
                }else {
                    System.out.println("密码错误!");
                    return;
                }
            }
        }
        System.out.println("不存在该用户!");
    }

    //注册--------------------------------------------------------
    public static void zhuCe(User us1,String remakePassword,ArrayList<User> list) {

        list.add(us1);
        System.out.println("注册成功!");
    }
    public static void forGot() {
        System.out.println("找回成功!");
    }
}
