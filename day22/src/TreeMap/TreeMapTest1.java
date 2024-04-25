package TreeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapTest1 {
    public static void main(String[] args) {
        TreeMap<Integer,String> tp=new TreeMap<>(/*new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        }*/);
        tp.put(1,"haha");
        tp.put(2,"Pixi");
        tp.put(3,"here");
        System.out.println(tp);
    }
}
