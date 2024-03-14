package com.test;

import java.util.Random;
public class Test02 {
    public static void main(String[] args) {
        /*需求:
        定义方法实现随机产生一个5位的验证码
        验证格式:
        长度为5
        前四位是大写字母或小写字母
        最后一位是数字
         */
        String result="";
        Random rd=new Random();
        char[] yz=new char[5];
        char[] t=new char[52];
        for (int i = 0; i < 52; i++) {
            if(i<26){
                t[i]=(char)(97+i);
            }else {
                t[i]=(char)(65+i-26);
            }
        }

        for (int i = 0; i < 4; i++) {
            int randomNext= rd.nextInt(t.length);
            yz[i]=t[randomNext];
            result=result+yz[i];
        }
        int number=rd.nextInt(10);
        result=result+number;

            System.out.print(result);
    }
}
