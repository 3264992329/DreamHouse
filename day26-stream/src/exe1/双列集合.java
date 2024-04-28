package exe1;

import java.util.HashMap;
import java.util.Set;

public class Ë«ÁÐ¼¯ºÏ {
    public static void main(String[] args) {
        HashMap<String,String> hm=new HashMap<>();
        hm.put("111","aaa");
        hm.put("222","bbb");
        hm.put("333","ddd");

        Set<String> strings = hm.keySet();
        strings.stream().forEach(s -> {System.out.println(s);});

        hm.entrySet().stream().forEach(stringStringEntry -> {System.out.println(stringStringEntry);});

    }
}
