package exe1;

import java.util.ArrayList;

public class ���м��� {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        list.stream().forEach(s -> {
            System.out.println(s);
        });
    }
}
