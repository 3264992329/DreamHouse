package exec;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        String[] s={"A","B","C","D"};
        String[] temp=new String[80];
        for (int i = 0; i < 80; i++) {
            Random rd=new Random();
            int t= rd.nextInt(s.length);
            temp[i]=s[t];
        }

        Map<String,Integer> map=new HashMap<>();
        for (String s1:temp){
            if (map.containsKey(s1)){
                int count= map.get(s1);
                count++;
                map.put(s1,count);
            }else {
                map.put(s1,1);
            }
            System.out.println(s1);
        }

        int max=-1;
        String end="";
        for (Map.Entry<String,Integer> result:map.entrySet()){
            if (max<result.getValue()){
                max=result.getValue();
                end=result.getKey();
            }
            System.out.println(result.getKey()+"------"+result.getValue());
            System.out.println("最多投票的为:"+end+",共"+max+"票");
        }

    }
}
