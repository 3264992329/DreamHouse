package Method01;
import java.util.Scanner;
import java.util.Random;
public class Test04 {
//当在调用处要根据方法的结果,去编写另外一段代码,
//就会运用到有返回值的方法
    public static void main(String[] args) {

        //直接调用
        getSum(10,20,30);

        //赋值调用
        //第一个月的收入
        double sum1=getSum(10,20,30);
        //第二个月的收入
        double sum2=getSum(10,20,30);
        //第三个月的收入
        double sum3=getSum(10,20,30);
        //第四个月的收入
        double sum4=getSum(10,20,30);

        double sum=sum1+sum2+sum3+sum4;
        //此处运用到根据方法返回的结果
        System.out.println(sum);

        System.out.println(getSum(10,20,30));
    }

    //带返回值的调用方法
    public static double getSum(int num1,int num2,int num3) {
        int result=num1+num2+num3;
        return result;
    }
}
