package demo;
import java.util.Random;

public class 打乱数据 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        for (int i = 0; i < 5; i++) {
            //生成随机数
            Random r=new Random();
            int a= r.nextInt(5);

            int t=arr[i];
            arr[i]=arr[a];
            arr[a]=t;

        }

        for (int i = 0; i < 5; i++) {
            System.out.println("arr["+i+"]="+arr[i]);
        }
    }
}
