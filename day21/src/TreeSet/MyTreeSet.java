package TreeSet;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class MyTreeSet {
    public static void main(String[] args) {
        TreeSet<String> ts=new TreeSet<>();
        ts.add("aaa");
        ts.add("bbb");
        ts.add("ccc");
        ts.add("ddd");
        ts.add("eee");

        //迭代器遍历
        Iterator<String> iterator = ts.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("-----------------------------");
        //Lambda遍历
        ts.forEach( s->System.out.println(s));

        System.out.println("-----------------------------");
        System.out.println("-----------------------------");
        TreeSet<student> ts1=new TreeSet<>();
        student st1=new student("张三",69);
        student st2=new student("李四",92);
        student st3=new student("王五",63);
        ts1.add(st1);
        ts1.add(st2);
        ts1.add(st3);
        //使用了comparable接口,重写了compareTo方法,按照年龄从小到大排序
        System.out.println(ts1);


        //第二种方式,比较器排序
        TreeSet<String> ts2=new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int i=o1.length()-o2.length();
                i=i==0?o1.compareTo(o2):i;
                return i;
            }
        });

        ts2.add("a");
        ts2.add("bbsdfop");
        ts2.add("adcccaa");
        ts2.add("ddshgd");
        System.out.println(ts2);
    }
}
