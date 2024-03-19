package demo02;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        //录入金额
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个金额:");
        int number;
        while (true) {
            number = sc.nextInt();
            if (number > 0 && number < 999999) {
                break;
            } else {
                System.out.println("金额无效!");
            }
        }

        System.out.println(toAlb(number));
    }

    public static String toAlb(int number) {
        int a=0;
        int t=number;
        String[] arr={"零","壹","贰","叁","肆",
                     "伍", "陆","柒","捌","玖"};
        String result="";

        while (true){

        }

        return result;
    }
}
