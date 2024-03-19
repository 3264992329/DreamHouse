package demo01;

import java.util.Scanner;

public class StringBack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入需要反转的字符串");
        String str=sc.next();
        System.out.println(back(str));
    }

    public static String back(String str) {
        int a = str.length();
        String t = "";

        for (int j = a-1; j >= 0; j--) {
            t=t+str.charAt(j);
        }

        return t;
    }
}
