package 引用构造方法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class test1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"zhangsan,23","lisi,24","wangwu,25");

        list.stream().map(new Function<String, student>() {
            @Override
            public student apply(String s) {
                return new student(s.split(",")[0],Integer.parseInt(s.split(",")[1]));
            }
        }).forEach(student -> System.out.println(student));

        System.out.println("================================");

        list.stream().map(student::new).forEach(student -> System.out.println(student));
    }
}
