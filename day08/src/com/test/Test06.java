package com.test;

import java.util.Random;
import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {

        //生成中奖号码
        System.out.println("生成中奖号码");
        int[] a=new int[7];
        Random rd=new Random();

        int i=0;
        while (i<6){
            int b= rd.nextInt(33)+1;
            boolean t=contains(b,a);
            if(!t){
                a[i]=b;
                i++;
            }
        }
        a[6]= rd.nextInt(16)+1;

        for (int j = 0; j < 7; j++) {
            System.out.print(a[j]+" ");
        }

        System.out.println();

        //彩民选号
        int[] c=new int[7];
        Scanner sc=new Scanner(System.in);

        //红球选号
        System.out.println("请输入6位不重复红球的号:");

        for (int j = 0; j < 6; ) {
            int number= sc.nextInt();
            if(number>0&&number<=33){
                if (!contains(number,c)){
                    c[j]=number;
                    j++;
                }else {
                    System.out.println("输入的数字已经存在,请重新输入:");
                }
            }else {
                System.out.println("输入数据超出范围,请重新输入:");
            }
        }

        //蓝球选号
        System.out.println("请输入蓝球选号");
        for (int j = 6; j < 7; ) {
            int number1= sc.nextInt();
            if(number1>0&&number1<=16){
                    c[j]=number1;
                    j++;
                } else {
                System.out.println("输入数据超出范围,请重新输入:");
            }
        }

        System.out.println("最终您选票为:");
        for (int j = 0; j < 7; j++) {
            System.out.print(c[j]+" ");
        }

        //核对中奖等级
        int redAll=0,blueAll=0;
        //判断红球
        for (int j = 0; j < 6; j++) {
            for (int k = 0; k < 6; k++) {
                if(c[j]==a[k]){
                    redAll++;
                    break;
                }
            }
        }
        //判断蓝球
        if(c[6]==a[6]){
            blueAll++;
        }

        System.out.println();

        System.out.println("红球中了"+redAll+"个"+"蓝球中了"+blueAll+"个");

        if(redAll==6&&blueAll==1){
            System.out.println("恭喜中奖1000万!");
        } else if (redAll==6&&blueAll==0) {
            System.out.println("恭喜中奖500万!");
        } else if (redAll==5) {
            System.out.println("恭喜中奖3000元!");
        } else if (redAll==4) {
            System.out.println("恭喜中奖200元!");
        } else if (redAll==3&&blueAll==1||redAll==2&&blueAll==1) {
            System.out.println("恭喜中奖10元!");
        } else if (blueAll==1) {
            System.out.println("恭喜中奖5元!");
        }else {
            System.out.println("很遗憾,你没中奖～");
        }
        //核对等级

    }

    public static boolean contains(int t,int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (t == a[i]) {
                return true;
            }
        }
        return false;
    }
}
