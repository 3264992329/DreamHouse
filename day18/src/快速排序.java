public class 快速排序 {
    public static void main(String[] args) {
        int[] a={5,8,45,64,1,2,35,15,654,5,21};

        int[] b=arr(a,1,a.length);
        for (int i = 0; i < a.length; i++) {
            System.out.println(b[i]);
        }
    }

    public static int[] arr(int[] a,int i,int j) {
        int startIndex=i;
        int endIndex=j;

        int jiZun=a[i];
        //头指针
        while (endIndex>startIndex){
            if (a[endIndex]<a[jiZun]){
                break;
            }
            endIndex--;
        }
        //尾指针
        while (endIndex>startIndex){
            if (a[startIndex]>a[jiZun]){
                break;
            }
            startIndex++;
        }

        //指针交换
        int t=a[startIndex];
        a[startIndex]=a[endIndex];
        a[endIndex]=t;

        //标准值归位
        if (endIndex==startIndex){
            int temp=a[endIndex];
            a[endIndex]=a[startIndex];
            a[startIndex]=temp;
        }

        return a;
    }
}
