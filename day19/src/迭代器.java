import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class 迭代器 {
    public static void main(String[] args) {
        //创建集合并添加元素
        Collection<String> list=new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            //hasNext()获取元素并移动指针指向下一个元素
            System.out.println(it.next());
        }

        //iterator使用后指针不会复位,需要二次使用时需重新创建一个iterator
        Iterator<String> it1=list.iterator();
        while (it1.hasNext()){
            String temp=it1.next();
            System.out.println(temp);

            //使用迭代器遍历时,不能用集合的方法添加或删除,要使用iterator的删除方法
            if(temp.equals("bbb")){
                it1.remove();
            }

        }
        System.out.println(list);

    }
}
