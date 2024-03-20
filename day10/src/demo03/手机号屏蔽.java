package demo03;

import java.util.Scanner;

public class 手机号屏蔽 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入手机号:");
        String phoneNumber=sc.next();

        System.out.println(result(phoneNumber));
    }

    public static String result(String phoneNumber) {
        String start=phoneNumber.substring(0,3);
        String end=phoneNumber.substring(7);
        String last=start+"****"+end;
        return last;
    }
}
