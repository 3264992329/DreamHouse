package Demo1;
import java.util.Scanner;
public class 求质数暴力算法 {
    public static void main(String[] args) {
        System.out.println("请输入一个整数");
        Scanner sc = new Scanner(System.in);

        //定义一个变量表示标记.标记number是否为一个质数
        boolean a=true;
        int num= sc.nextInt();

        for (int i = 2; i <num ; i++) {
            if (num%i==0){
                a=false;
                break;
            }
        }

        if (a){
            System.out.println("该数是质数");
        }
        else {
            System.out.println("该数不是质数");
        }
    }
}
