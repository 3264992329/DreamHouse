package Method01;
import java.util.Scanner;
public class Test05 {
    public static void main(String[] args) {

        double[] a=new double[2];
        int i;
        for (i = 0; i < 2; i++) {
            System.out.println("请输入长方形的长和宽:");

            Scanner sc=new Scanner(System.in);
            double len=sc.nextInt();
            double wit=sc.nextInt();

            a[i]=compare(len,wit);
        }
        if (a[0]>a[1]){
            System.out.println("第一个大");
        }else {
            System.out.println("第二个大");
        }


    }

    public static double compare(double a,double b) {
        double area=a*b;
        return area;
    }
}
