package integerdemo;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int sum=0;
        while (sum<200){
            System.out.println("输入一个数据:");
            String num = sc.nextLine();
            int i = Integer.parseInt(num);
            if (i<1||i>100){
                System.out.println("输入范围不对");
            }else {
                list.add(i);
                sum+=i;
            }
            if (sum>=200){
                System.out.println("sum为:"+sum);
                break;
            }
        }
    }
}
