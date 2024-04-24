import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class MyMap {
    public static void main(String[] args) {
        Map<String,String> m= new HashMap<>();
        //添加元素
        m.put("徐涛","郑吉翠");
        m.put("杨过","小龙女");
        m.put("韦小宝","沐剑屏");

        System.out.println("------------");
        //在添加数据时,如果键不存在,那么会直接把键值对添加到map中,方法返回null
        //在添加数据时,如果键存在,那么会把原有的键值对对象覆盖,会把被覆盖的值进行返回
        String value=m.put("徐涛","郑吉翠");
        System.out.println(value);
        System.out.println("------------");
        //根据键删除键值对元素
        //m.remove("韦小宝");

        //移除所有键值对元素
        //m.clear();

        //判断集合包含指定的值
        boolean z= m.containsValue("小龙女1");
        System.out.println(z);
        //判断集合包含指定的键
        boolean j=m.containsKey("徐涛");
        System.out.println(j);

        //判断是否为空
        boolean empty = m.isEmpty();
        System.out.println(empty);

        //判断集合长度
        int size = m.size();
        System.out.println(size);


        System.out.println(m);

        System.out.println("------------遍历方法一--------------");
        //获取所有的键,把这些键放到单列集合中
        Set<String> keys = m.keySet();
        System.out.println("增强for");
        for (String key:keys){
            System.out.println(key);
            String value1=m.get(key);
            System.out.println(key+"love"+value1);
        }
        System.out.println("迭代器");
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()){
            String temp=iterator.next();
            String value2=m.get(temp);
            System.out.println(temp+"love"+value2);
        }
        System.out.println("Lambda表达式");
        keys.forEach((String s)-> {
                String value1=m.get(s);
                System.out.println(s);
                System.out.println(s+"love"+value1);
            }
        );
    }
}
