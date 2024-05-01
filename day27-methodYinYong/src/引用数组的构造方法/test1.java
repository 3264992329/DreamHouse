package 引用数组的构造方法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class test1 {
    public static void main(String[] args) {
        //把集合中的数据添加到数组中
        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9);

        Integer[] array1 = list.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(array1));
        Integer[] array = list.stream().toArray(new IntFunction<Integer[]>() {
            @Override
            public Integer[] apply(int value) {
                return new Integer[value];
            }
        });
        System.out.println(Arrays.toString(array));


    }
}
