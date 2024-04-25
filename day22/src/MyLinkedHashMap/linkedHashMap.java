package MyLinkedHashMap;

import java.util.LinkedHashMap;

public class linkedHashMap {
    public static void main(String[] args) {
        //LinkedHashMap<>保证存取顺序一致
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
        lhm.put("sss",111);
        lhm.put("ksjl",121);
        lhm.put("sfs",1121);
        lhm.put("ssjgfjs",1187);

        System.out.println(lhm);
    }
}
