package pokerGame3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class PokerGame {

    //静态代码块
    //随着类的加载而加载,只执行一次
    static HashMap<String,Integer> hm=new HashMap<>();
    static ArrayList<String> poker=new ArrayList<>();
    static {
        //定义牌
        String[] color={"红桃","方块","黑桃","梅花"};
        String[] number={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        for (int i = 0; i < color.length; i++) {
            for (int j = 0; j < number.length; j++) {
                poker.add(color[i]+number[j]);
            }
        }
        poker.add("  小王");
        poker.add("  大王");

        //对应的值
        hm.put("J",10);
        hm.put("Q",11);
        hm.put("K",12);
        hm.put("A",13);
        hm.put("2",14);
        hm.put("小王",15);
        hm.put("大王",16);
    }

    //洗牌
    public PokerGame(){
        Collections.shuffle(poker);

        ArrayList<String> dipai=new ArrayList<>();
        ArrayList<String> player1=new ArrayList<>();
        ArrayList<String> player2=new ArrayList<>();
        ArrayList<String> player3=new ArrayList<>();
        for (int i = 0; i < poker.size(); i++) {
            if (i<=2){
                dipai.add(poker.get(i));
            }
            else {
                if (i%3==0){
                    player1.add(poker.get(i));
                }else if (i%3==1){
                    player2.add(poker.get(i));
                }else {
                    player3.add(poker.get(i));
                }
            }
        }

        //玩家牌排序
        order(dipai);
        order(player1);
        order(player2);
        order(player3);

        //看牌
        lookPoker("底牌",dipai);
        lookPoker("player1",player1);
        lookPoker("player2",player2);
        lookPoker("player3",player3);
    }

    //排序
    public void order(ArrayList<String> p){
        Collections.sort(p, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int value1=getValue(o1.substring(2));
                String color1=o1.substring(0,2);
                int value2=getValue(o2.substring(2));
                String color2=o1.substring(0,2);
                int i=value1-value2;

                return i=i==0?color1.compareTo(color2):i;
            }
        });
    }

    //得到对应的值
    public Integer getValue(String key){
        if (hm.containsKey(key)){
            return hm.get(key);
        }else {
            return Integer.parseInt(key);
        }
    }

    //发牌
    public void lookPoker(String name,ArrayList<String> p){
        System.out.print(name+":");
        System.out.println(p);
    }
}
