package demo;

public class 交换数据 {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        for (int i = 0,j=arr.length-1; i <j; i++,j--) {
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("arr["+i+"]"+"="+arr[i]);
        }
    }
}
