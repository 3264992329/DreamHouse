package com.test;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入评委人数");
        int num= sc.nextInt();
        int max=0,min=101,sum=0;
        for (int i = 0; i < num; i++) {
            System.out.println("输入第"+i+"个评委的打分");
            int score= sc.nextInt();
            sum=sum+score;
            if(score>max){
                max=score;
            }
            if(score<min){
                min=score;
            }
        }

        int result=(sum-max-min)/(num-2);
        System.out.println("去掉最高分和最低分结果为:"+result);
    }
}
