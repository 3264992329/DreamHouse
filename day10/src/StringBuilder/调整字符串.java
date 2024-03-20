package StringBuilder;

import java.util.Scanner;

public class 调整字符串 {
    public static void main(String[] args) {
        String a="abcd123";
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入数组:");
        String str= sc.next();

        System.out.println("请输入次数:");
        int n= sc.nextInt();
        System.out.println(xz(str,n,a));
    }

    public static String xz(String str,int n,String a) {
        String result="";
        for (int i = 0; i < n; i++) {
            result=str.substring(1)+str.charAt(0);
            str=result;
            if (result.equals(a)){
                System.out.println("在第"+(i+1)+"次旋转时相等");
                break;
            }else if (i==n-1){
                System.out.println("在规定次数内不能找到相等的");
            }
        }
        return result;
    }


}
