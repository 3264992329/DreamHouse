package ArrayList01;

import java.util.ArrayList;

public class execise01 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+",");
        }
    }
}
