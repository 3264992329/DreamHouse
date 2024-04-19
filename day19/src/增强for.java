import java.util.ArrayList;
import java.util.Collection;

public class 增强for {
    public static void main(String[] args) {
        Collection<String> list=new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        for (String s:list){
            System.out.println(s);
        }
    }
}
