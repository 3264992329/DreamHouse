package demo03;

import java.util.Scanner;

public class 身份证信息查看 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        //510722200207313315
        System.out.println("请输入身份证号");
        String sfz=sc.next();

        String year=sfz.substring(6,10);
        System.out.println(" 出生于"+year+"年");

        char gender=sfz.charAt(16);
        int t=gender-48;
        if (t%2==0){
            System.out.println("性别:女");
        }else {
            System.out.println("性别:男");
        }
    }
}
