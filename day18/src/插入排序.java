public class 插入排序 {
    public static void main(String[] args) {
        int[] arr={1,56,5,35,65,19,54,323,155,41,32,3,2,45,6};

        int startIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>arr[i+1]){
                startIndex=i+1;
                break;
            }
        }

        for (int i = startIndex; i < arr.length; i++) {
            int j=i;
            while (j>0&&arr[j]<arr[j-1]){
                    int t=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=t;
                    j--;
            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
    }
}
