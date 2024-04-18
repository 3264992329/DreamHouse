package Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Lambdademo1 {
    public static void main(String[] args) {
        String[] arr={"aaaa","a","aaa","aa"};

       /* Arrays.sort(arr,new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        }); */

        //Lambda表达式
       Arrays.sort(arr,(String o1, String o2) ->{
                return o1.length()-o2.length();
            }
        );

        System.out.println(Arrays.toString(arr));

    }
}
