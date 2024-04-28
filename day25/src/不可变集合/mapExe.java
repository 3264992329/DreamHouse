package 不可变集合;

import java.util.HashMap;
import java.util.Map;

public class mapExe {
    public static void main(String[] args) {
        Map<String, String> a = Map.of("a", "1", "b", "2");

        HashMap<String,String> hm=new HashMap<>();
        hm.put("1","a");
        hm.put("2","b");
        hm.put("3","b");

        Map<String,String> kvMap = Map.ofEntries(hm.entrySet().toArray(new Map.Entry[0]));

        Map<Object, Object> objectObjectMap = Map.copyOf(hm);

    }
}
