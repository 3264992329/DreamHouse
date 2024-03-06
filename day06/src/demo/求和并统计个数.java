package demo;
import java.util.Random;
import java.util.Scanner;

public class 求和并统计个数 {
    public static void main(String[] args) {
        Random r=new Random();

        int sum=0;
        int[] arr =new int[10];
        for (int i = 0; i < 10; i++) {
            int t= r.nextInt(100)+1;
            arr[i]=t;
            System.out.println("随机数"+i+"为:"+arr[i]);
            sum=sum+arr[i];
        }
        System.out.println("总数为:"+sum);

        int avg=sum/10;
        System.out.println("平均数为:"+avg);

        int b=0;
        for (int i = 0; i < 10; i++) {
            if (arr[i]<avg){
                b=b+1;
            }
        }
        System.out.println("一共有"+b+"个数小于平均数");

    }
}
