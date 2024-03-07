package Method01;
import java.util.Scanner;
public class Test07 {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8,9};

        Scanner sc=new Scanner(System.in);

        System.out.println("请输入从第几个开始:");
        int from= sc.nextInt()-1;
        System.out.println("请输入到第几个结束:");
        int to= sc.nextInt();

        int[] copyof=copy(arr,to,from);

        for (int i = 0; i < copyof.length; i++) {
            System.out.print(copyof[i]+" ");
        }
    }

    public static int[] copy(int[] arr,int to,int from) {
        int[] arr2=new int[to-from];
        for (int i = from; i < to; i++) {
            arr2[i-from]=arr[i];
        }
        return arr2;
    }
}
