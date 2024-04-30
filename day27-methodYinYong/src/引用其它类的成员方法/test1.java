package 引用其它类的成员方法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class test1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"赵丽颖","杨颖","杨圆原","张甜甜","刘思","养小蜜");

        //以杨开头,且是3个字
        list.stream().
                filter(s -> s.startsWith("杨")).
                filter(s -> s.length()==3).
                forEach(s -> System.out.println(s));

        System.out.println("=====================");

        list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("杨")&&s.length()==3;
            }
        }).forEach(s -> System.out.println(s));

        System.out.println("=====================");
        list.stream().filter(new stringJudge()::stringFilter).forEach(s -> System.out.println(s));

    }
}
