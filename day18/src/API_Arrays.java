import java.util.Arrays;

public class API_Arrays {
    public static void main(String[] args) {
        //复制数组
        //方法1
        int[] a={4,8,2,3,9,10,11,12,1,5,6,7};
        int[] copy1=Arrays.copyOf(a,10);
        System.out.println(Arrays.toString(copy1));
        //方法2
        int[] copy2=Arrays.copyOfRange(a,0,6);
        System.out.println(Arrays.toString(copy2));

        //fill填充数组
        //Arrays.fill(a,1);
        //System.out.println(Arrays.toString(a));

        //sort排序
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
