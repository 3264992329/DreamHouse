package Method01;
import java.util.Scanner;

public class Test03 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入2个数据:");
        int a= sc.nextInt();
        int b= sc.nextInt();

        System.out.println("输入圆的半径:");
        int r= sc.nextInt();

        getArea(r);
        getSum(a,b);
    }

    //method
    public static void getSum(int num1,int num2) {
        int result=num1+num2;
        System.out.println("和为:"+result);
    }

    public static void getArea(int r) {
        double Area=3.14*r*r/2;
        System.out.println("圆的面积为:"+Area);
    }
}
