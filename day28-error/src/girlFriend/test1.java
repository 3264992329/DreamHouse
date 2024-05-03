package girlFriend;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入女朋友信息:");

        girls gl1=new girls();

        while (true) {
            try {
                System.out.println("请输入女朋友名字:");
                String name=sc.nextLine();
                gl1.setName(name);
                System.out.println("请输入女朋友年龄");
                String age=sc.nextLine();
                gl1.setAge(Integer.parseInt(age));
                //输入信息全部正确,结束循环
                break;
            } catch (NumberFormatException e) {
                System.out.println("输入年龄格式错误,请输入数字:");
            } catch (Exception e) {
                System.out.println("输入名字长度或年龄范围错误:");
            }
        }

        System.out.println(gl1);
    }
}
