package ����������ĳ�Ա����;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class test1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"����ӱ","��ӱ","��Բԭ","������","��˼","��С��");

        //���ͷ,����3����
        list.stream().
                filter(s -> s.startsWith("��")).
                filter(s -> s.length()==3).
                forEach(s -> System.out.println(s));

        System.out.println("=====================");

        list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("��")&&s.length()==3;
            }
        }).forEach(s -> System.out.println(s));

        System.out.println("=====================");
        list.stream().filter(new stringJudge()::stringFilter).forEach(s -> System.out.println(s));

    }
}
