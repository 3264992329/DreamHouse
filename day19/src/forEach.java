import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class forEach {
    public static void main(String[] args) {
        Collection<String> list=new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        //利用匿名内部类
       /* list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        }); */

        //2.Lambda表达式
        list.forEach(s -> System.out.println(s));
    }
}
