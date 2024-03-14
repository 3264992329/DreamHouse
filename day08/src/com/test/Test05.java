package com.test;

import java.util.Random;

public class Test05 {
    public static void main(String[] args) {
        //抽奖
        int[] win={888,666,520,123,66,52};
        Random rd=new Random();

        int len= win.length;
        boolean[] z=new boolean[len];
        for (int i = 0; i < len; i++) {
            z[i]=false;
        }
        while (len>=0){
            int randomNext=rd.nextInt(6);
            if(z[randomNext]){
                continue;
            }else {
                int t=win[randomNext];
                System.out.println(t+"奖金被抽出");
                z[randomNext]=true;
                len--;
            }
        }
    }
}
