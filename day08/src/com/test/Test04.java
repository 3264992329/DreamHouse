package com.test;

import java.util.Arrays;
import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        //需求
        //把整数上的每一位都添加到数组当中

        System.out.println("输入数字");
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();

        int len=0;
        int num=number;
        while(num!=0){
            num=num/10;
            len++;
        }
        int[] a=new int[len];
        int count=0;
        while (number>0){
            a[count]=number%10;
            number=number/10;
            count++;
        }

        for (int i = len-1; i >=0; i--) {
            System.out.print(a[i]+" ");
        }
        System.out.println();

        //加密
        int[] b=a;
        for (int i = len-1; i >= 0; i--) {
            b[i]=(a[i]+5)%10;
        }
        System.out.println("加密后的结果为:");
        for (int i = 0; i < len; i++) {
            System.out.print(b[i]+" ");
        }
        System.out.println();

        //解密
        int[] d=b;
        for (int i = 0; i < len; i++) {
            if(d[i]<=4){
                d[i]=d[i]+10-5;
            }else {
                d[i]=d[i]-5;
            }
        }
        System.out.println("解密后的结果为:");
        for (int i = len-1; i >=0 ; i--) {
            System.out.print(d[i]+" ");
        }
        System.out.println();

    }
}
