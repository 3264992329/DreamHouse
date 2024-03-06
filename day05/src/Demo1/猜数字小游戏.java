package Demo1;
import java.util.Random;
import java.util.Scanner;

public class 猜数字小游戏 {
    public static void main(String[] args) {

        Random rd= new Random();
        //小括号中书写生成随机数的范围
        //口诀:包头不包尾,包左不包右
        int num= rd.nextInt(100);//0-99

        Scanner sc=new Scanner(System.in);
        int guess=sc.nextInt();

        while(true){
            if(guess<num){
                System.out.println("小了");
            }
            if (guess>num){
                System.out.println("大了");
            }
            if (guess==num){
                System.out.println("对了");
                break;
            }
            System.out.println("请重新输入一个数:");
            guess=sc.nextInt();
        }

        //其他范围表示方法
        //int num= rd.nextInt(100)+7;//7-106

        System.out.println(num);
    }
}
