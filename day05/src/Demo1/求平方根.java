package Demo1;

import java.util.Scanner;
public class 求平方根 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");

        int x=sc.nextInt();
        for (int i = 1; i <= x; i++) {
            if (i*i>x){
                int t=i-1;
                System.out.println("平方根为:"+t);
                break;
            }
            if (i*i==x){
                System.out.println("平方根为"+i);
                break;
            }
        }
    }
}
