package exeLast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class test1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"张无忌,23","徐涛,21","郑吉翠,22");
        student[] array = list.stream().map(student::new).toArray(student[]::new);
        System.out.println(Arrays.toString(array));
    }
}
