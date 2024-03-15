package com.test;

public class Test07 {
    public static void main(String[] args) {
        int[][] arr={
                {22,66,44},
                {77,33,88},
                {25,45,65},
                {11,66,99}
        };
        int yearSum=0;
        for (int i = 0; i < 4; i++) {
            int sum=getSum(arr,i);
            System.out.println("第"+(i+1)+"季度总收入为:"+sum);
            yearSum+=sum;
        }
        System.out.println("全年总营业额为:"+yearSum);
    }

    public static int getSum(int[][] a,int i) {
            int sum=0;
            for (int j = 0; j < a[i].length; j++) {
                sum=sum+a[i][j];
            }
            return sum;
    }
}
