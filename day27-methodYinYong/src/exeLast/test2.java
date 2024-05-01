package exeLast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class test2 {
    public static void main(String[] args) {
        ArrayList<student> list=new ArrayList<>();
        list.add(new student("aaa",18));
        list.add(new student("aĞìÌÎa",21));
        list.add(new student("Ö£¼ª´ä",21));

        String[] array = list.stream().map(new Function<student, String>() {
            @Override
            public String apply(student stu) {
                return stu.getName();
            }
        }).toArray(String[]::new);
        System.out.println(Arrays.toString(array));

        System.out.println("==========================");

        String[] array1 = list.stream().map(student::getName).toArray(String[]::new);
        System.out.println(Arrays.toString(array1));
    }
}
