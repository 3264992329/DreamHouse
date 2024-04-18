import java.util.Random;

public class 快速排序 {
    public static void main(String[] args) {
        int[] a=new int[999];
        for (int i = 0; i < 999; i++) {
            Random rd=new Random();
            a[i]= rd.nextInt(999);
        }

        int[] b=arr(a,0,a.length-1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(b[i]);
        }
    }

    public static int[] arr(int[] a,int i,int j) {

        int startIndex=i;
        int endIndex=j;

        //递归出口
        if (startIndex>=endIndex){
            return a;
        }

        while (startIndex!=endIndex){
            int jiZun=a[i];
            //头指针
            while (endIndex>startIndex){
                if (a[endIndex]<jiZun){
                    break;
                }
                endIndex--;
            }
            //尾指针
            while (endIndex>startIndex){
                if (a[startIndex]>jiZun){
                    break;
                }
                startIndex++;
            }

            //指针交换
            int t=a[startIndex];
            a[startIndex]=a[endIndex];
            a[endIndex]=t;
        }


        //标准值归位
        if (endIndex==startIndex){
            int temp=a[i];
            a[i]=a[startIndex];
            a[startIndex]=temp;
        }

        //递归
        arr(a,i,startIndex-1);
        arr(a,startIndex+1,j);

        return a;
    }
}
