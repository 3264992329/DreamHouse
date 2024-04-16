package integerdemo;

import java.util.Scanner;

public class integerDemo1 {
    public static void main(String[] args) {
        //输出二进制
        String binaryString = Integer.toBinaryString(100);
        System.out.println(binaryString);
        //输出八进制
        String octalString = Integer.toOctalString(100);
        System.out.println(octalString);
        //输出十六进制
        String hexString = Integer.toHexString(100);
        System.out.println(hexString);

        int i = Integer.parseInt("546548");
        System.out.println(i);

        Scanner sc=new Scanner(System.in);
        System.out.println("输入数据:");
        String string = sc.nextLine();
        double db=Double.parseDouble(string);
        System.out.println(db);

    }
}
