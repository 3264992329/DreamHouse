package exe3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test3 {
    public static void main(String[] args) {
        ArrayList<String> manList=new ArrayList<>();
        ArrayList<String> womanList=new ArrayList<>();
        Collections.addAll(manList,"蔡徐坤,24","叶良辰,23","刘天天,22","吴谦,24","钴价,30","蛤蟆皮,27");
        Collections.addAll(womanList,"赵丽颖,35","杨颖,36","杨圆圆,43","张甜甜,31","刘思,35","养小蜜,31");

        //只要名字为三个字的前两个男演员
        Stream<String> limit = manList.stream().
                filter(s -> s.split(",")[0].length() == 3).
                limit(2);

        System.out.println("====================");
        //女演员只要姓杨的,且不要第一个
        Stream<String> yang = womanList.stream().
                filter(s -> s.split(",")[0].startsWith("杨")).
                skip(1);

        System.out.println("====================");
        //过滤后的男女演员流合并到一起,并封装成actor对象(属性:姓名,年龄)
        List<actor> collect = Stream.concat(limit, yang).
                map(s -> new actor(s.split(",")[0], Integer.parseInt(s.split(",")[1]))).
                collect(Collectors.toList());
        System.out.println(collect);
    }
}
