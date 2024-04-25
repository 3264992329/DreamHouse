import java.util.*;
import java.util.function.BiConsumer;

public class TreeMapDemo3 {
    public static void main(String[] args) {
        String sum="ababsbdcbbaaabde";
        TreeMap<Character,Integer> tm=new TreeMap<>();
        for (int i = 0; i < sum.length(); i++) {
            char t=sum.charAt(i);
            if (tm.containsKey(t)){
                int temp=tm.get(t);
                temp++;
                tm.put(t,temp);
            }else {
                tm.put(t,1);
            }
        }

        Set<Map.Entry<Character, Integer>> entries = tm.entrySet();
        Iterator<Map.Entry<Character, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        StringJoiner sj=new StringJoiner(",","[","]");
        tm.forEach((Character character, Integer integer)->{
                sj.add(character+"").add(integer+"");
            }
        );
        System.out.println(sj);
    }
}
