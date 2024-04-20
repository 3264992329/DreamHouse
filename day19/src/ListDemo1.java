import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class ListDemo1 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        //迭代器遍历
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("----------------------------");
        //增强for遍历
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("----------------------------");
        //匿名内部类
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        //forEach遍历
        System.out.println("----------------------------");
        list.forEach(s -> System.out.println(s));

        //普通for
        System.out.println("----------------------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("----------------------------");
        //列表迭代器
        ListIterator<String> stringListIterator = list.listIterator();
        while (stringListIterator.hasNext()){
            String s=stringListIterator.next();
            System.out.println(s);
            if (s.equals("bbb")){
                stringListIterator.add("add");
            }
        }
        System.out.println(list);
    }
}
