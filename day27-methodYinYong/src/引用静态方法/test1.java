package ���þ�̬����;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class test1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"1","2","3","4","5","6");

        list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                int i=Integer.parseInt(s);
                return i;
            }
        }).forEach(s-> System.out.println(s));

        System.out.println("====================");

        //��������
        list.stream().map(Integer::parseInt).
                forEach(s-> System.out.println(s));
    }
}
