package StringBuilder;

import java.util.Scanner;
import java.util.StringJoiner;

public class 转换罗马数字 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入需要转化的数字:");
        String str=sc.next();

        if(pd(str)){
            System.out.println(toRoma(str));
        }else {
            System.out.println("不满足条件");
        }


    }

    public static String toRoma(String str) {
        String[] arr={" ","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
        StringJoiner result= new StringJoiner(",","[","]");
        for (int i = 0; i < str.length(); i++) {
            int t=str.charAt(i)-48;
            result.add(arr[t]);
        }
        return result.toString();
    }

    public static boolean pd(String str) {
        for (int i = 0; i < str.length(); i++) {

            if(str.charAt(i)<48||str.charAt(i)>57){
                return false;
            }else if(str.length()>9){
                return false;
            }

        }
        return true;
    }
}
