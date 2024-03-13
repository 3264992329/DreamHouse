package com.test;


import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入当前月份");
        int month= sc.nextInt();
        System.out.println("0头等舱1经济舱");
        int grade= sc.nextInt();
        System.out.println("输入头等舱价格");
        double head= sc.nextInt();
        System.out.println("输入经济舱价格");
        double end= sc.nextInt();

        double sum=getpreice(month,grade,head,end);

        System.out.println(sum);
    }

    public static double getpreice(int month,int grade,double head,double end){
        double preice;
        if (month<=11&&month>=4){
            if (grade==0){
                preice=head*0.9;
            }else {
                preice=end*0.85;
            }
        }else {
            if (grade==0){
                preice=head*0.7;
            }else {
                preice=end*0.65;
            }
        }
        return preice;
    }
}