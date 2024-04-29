package exe2;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"a-1","a-1","c-2","e-3","r-4","g-5","f-6");

        //过滤
        list.stream().filter(s -> s.length()==1).forEach(s -> {System.out.println(s);});
        System.out.println("===============================================");
        //获取前几个元素
        list.stream().limit(3).forEach(s -> {System.out.println(s);});
        System.out.println("===============================================");
        //跳过前几个元素
        list.stream().skip(5).forEach(s -> {System.out.println(s);});
        System.out.println("===============================================");
        //元素去重
        list.stream().distinct().forEach(s -> {System.out.println(s);});
        System.out.println("===============================================");
        //合并a和b为一个流
        ArrayList<String> list1=new ArrayList<>();
        Collections.addAll(list1,"1","1","2","3","4","5","6");
        Stream.concat(list1.stream(),list.stream()).forEach(s -> {System.out.println(s);});
        System.out.println("===============================================");
        //转换流中的数据
        list.stream().map(s -> Integer.parseInt(s.split("-")[1])).forEach(s -> {System.out.println(s);});
        System.out.println("===============================================");
        //统计
        System.out.println(list.stream().count());
        System.out.println("===============================================");
        //收集流中的数据,放到数据中
        String[] array = list.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(array));
        System.out.println("===============================================");
        //收集到List集合当中
        ArrayList<String> list2=new ArrayList<>();
        Collections.addAll(list2,"男-1-徐涛","男-5-刘涛","女-18-郑吉翠","男-3-吴明聪","女-2-小燕子","男-5-杨雅国","女-6-女哈尔");
        List<String> collect1 = list2.stream().collect(Collectors.toList());
        System.out.println(collect1);
        System.out.println("===============================================");
        //收集到Set集合当中
        Set<String> collect = list2.stream().collect(Collectors.toSet());
        System.out.println(collect);
        System.out.println("===============================================");
        //收集到Map集合当中
        Map<String, String> collect2 = list2.stream().collect(Collectors.toMap(s -> s.split("-")[2], s -> s.split("-")[1]));
        System.out.println(collect2);
    }
}
