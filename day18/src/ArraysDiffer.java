import java.util.Arrays;
import java.util.Comparator;

public class ArraysDiffer {
    public static void main(String[] args) {
        Integer[] a={2,5,4,1,2,3,5,6,5,4,15,4,1};
        Arrays.sort(a,(Integer a1,Integer a2)->{
                return a2-a1;
            }
        );
        System.out.println(Arrays.toString(a));

    }

}
