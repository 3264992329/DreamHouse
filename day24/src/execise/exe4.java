package execise;

import java.util.*;
import java.util.function.Consumer;

public class exe4 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hp=new HashMap<>();
        ArrayList<String> list1=new ArrayList<>();
        list1.add("p1");
        list1.add("p2");
        list1.add("p3");
        list1.add("p4");
        ArrayList<String> list2=new ArrayList<>();
        list2.add("r1");
        list2.add("r2");
        list2.add("r3");
        list2.add("r4");
        ArrayList<String> list3=new ArrayList<>();
        list3.add("l1");
        list3.add("l2");
        list3.add("l3");
        list3.add("l4");
        ArrayList<String> list4=new ArrayList<>();
        list4.add("o1");
        list4.add("o2");
        list4.add("o3");
        list4.add("o4");

        hp.put("四川",list1);
        hp.put("云南",list2);
        hp.put("贵州",list3);
        hp.put("河北",list4);

        Set<Map.Entry<String, ArrayList<String>>> entries = hp.entrySet();
        entries.forEach(new Consumer<Map.Entry<String, ArrayList<String>>>() {
            @Override
            public void accept(Map.Entry<String, ArrayList<String>> stringArrayListEntry) {
                StringJoiner sj=new StringJoiner(",","","");
                ArrayList<String> temp=stringArrayListEntry.getValue();
                for (String t:temp){
                    sj.add(t);
                }
                System.out.println(stringArrayListEntry.getKey()+"->"+sj);
            }
        });
    }
}
