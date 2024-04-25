import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class MyMap2 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("sss","sdf");
        map.put("sff gs","HDFS");
        map.put("yy","sfd51");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        //增强for
        for (Map.Entry<String, String> entry:entries){
            System.out.print(entry.getKey()+"  ---  ");
            System.out.println(entry.getValue());
        }
        System.out.println("-----------------------------");
        //Lambda
        entries.forEach((Map.Entry<String, String> stringStringEntry)-> System.out.println(stringStringEntry.getKey()+"  ---  "+stringStringEntry.getValue()));
        System.out.println("-----------------------------");
        //迭代器
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next.getKey()+"  ---  "+next.getValue());
        }

        System.out.println("------------- map.entrySet()-2----------------");
        //增强for
        for (Map.Entry<String, String> entry: map.entrySet()){
            System.out.print(entry.getKey()+"  ---  ");
            System.out.println(entry.getValue());
        }
    }
}
