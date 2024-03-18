package demo08;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Car[] arr=new Car[3];
        Scanner sc=new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            Car c=new Car();
            System.out.println("输入车名称:");
            String name=sc.next();
            c.setName(name);
            System.out.println("输入车价格:");
            int pc= sc.nextInt();
            c.setPrice(pc);
            System.out.println("输入车颜色:");
            String cl=sc.next();
            c.setColor(cl);

            //把对象放到数组中
            arr[i]=c;
        }

        System.out.println("=======================");

        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i].getName()+",");
            System.out.print(arr[i].getColor()+",");
            System.out.println(arr[i].getPrice()+".");
            System.out.println("=======================");
        }
    }
}
