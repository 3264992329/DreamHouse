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
            if (number > 0 && number < 9999999) {
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
        String[] brr={"百万","十万","万","千","佰",
                     "拾","元"};
        String result="";

        while (true){
            int ge=number%10;
            result=arr[ge]+result;
            number=number/10;
            if (number==0){
                break;
            }
        }

        int count=7-result.length();
        for (int i = 0; i < count; i++) {
            result="零"+result;
        }

        String resultEnd="";
        for (int i = 0; i < result.length(); i++) {
            resultEnd=resultEnd+result.charAt(i)+brr[i];
        }
        return resultEnd;
    }
}
