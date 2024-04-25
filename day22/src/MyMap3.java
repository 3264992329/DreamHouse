import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MyMap3 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("刘涛","明知山有虎,别去明知山");
        map.put("刘备","不可能绝对不可能");
        map.put("曹操","接着奏乐接着舞");

        //Lambda
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key+"  ---  "+value);
            }
        });

        System.out.println("---------------------");
        map.forEach((String key, String value)-> System.out.println(key+"  ---  "+value));
    }
}
