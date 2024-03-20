package StringBuilder;

import java.util.Scanner;

public class reserseTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入需要判断的字符串");
        String a= sc.next();
        String result=new StringBuilder().append(a).reverse().toString();

        if (result.equals(a)){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
