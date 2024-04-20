import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        //添加
        list.add(1,"ggg");
        System.out.println(list);
        //删除
        list.remove(1);
        System.out.println(list);
        //删除2
        List<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        //删除 1
        //方法一:
        //list.remove(0);
        //list1.remove(0);
        System.out.println(list);
        System.out.println(list1);
        //方法二:
        String s=String.valueOf("aaa");
        Integer i=Integer.valueOf(1);
        list.remove(s);
        list1.remove(i);
        System.out.println(list);
        System.out.println(list1);

        //修改
        list.set(0,"xxx");
        System.out.println(list);

        //打印
        String p=list.get(1);
        System.out.println(p);
    }
}
