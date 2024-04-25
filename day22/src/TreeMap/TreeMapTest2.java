package TreeMap;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class TreeMapTest2 {
    public static void main(String[] args) {
        TreeMap<student,String> tm=new TreeMap<>(/*new Comparator<student>() {
            @Override
            public int compare(student o1, student o2) {
                return o1.getAge()- o2.getAge();
            }
        }*/);
        student st1=new student("张三",21);
        student st2=new student("李四",65);
        student st3=new student("王五",6);
        student st4=new student("赵六",71);

        tm.put(st1,"绵阳");
        tm.put(st2,"泸州");
        tm.put(st3,"广元");
        tm.put(st4,"攀枝花");

        Set<Map.Entry<student, String>> entries = tm.entrySet();
        entries.forEach(new Consumer<Map.Entry<student, String>>() {
            @Override
            public void accept(Map.Entry<student, String> studentStringEntry) {
                System.out.println(studentStringEntry);
            }
        });
        System.out.println(tm);
    }
}
