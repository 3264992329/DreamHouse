package HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class mySet01 {
    public static void main(String[] args) {
        Set<String> s=new HashSet<>();
        //添加到元素不能重复:
        s.add("张三");
        s.add("张三");
        s.add("李四");
        s.add("王五");
        //没有索引
        System.out.println(s);
        System.out.println("----------");
        //迭代器遍历:
        Iterator<String> iterator= s.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("----------");
        //增强for
        for (String str:s){
            System.out.println(str);
        }
        System.out.println("----------");
        //Lambda
        s.forEach((String str)->{
            System.out.println(str);
        });
    }
}
