package PokerGame2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.function.BiConsumer;

public class PokerGame {

    //静态代码块
    //随着类的加载而加载,只执行一次
    static HashMap<Integer,String> hm=new HashMap<>();
    static ArrayList<Integer> list=new ArrayList<>();
    static {
        //定义牌
        String[] color={"红桃","方块","黑桃","梅花"};
        String[] number={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        int serialNumber=1;
        for (String i:number){
            for (String j:color){
                hm.put(serialNumber,j+i);
                list.add(serialNumber);
                serialNumber++;
            }
        }
        hm.put(serialNumber,"joker");
        list.add(serialNumber);
        hm.put(serialNumber+1,"JOKER");
        list.add(serialNumber+1);
    }

    //洗牌
    public PokerGame(){
        Collections.shuffle(list);
        TreeSet<Integer> lord=new TreeSet<>();
        TreeSet<Integer> player1=new TreeSet<>();
        TreeSet<Integer> player2=new TreeSet<>();
        TreeSet<Integer> player3=new TreeSet<>();
        for (int i = 0; i < hm.size(); i++) {
            //t代表牌的大小
            int t=list.get(i);
            if (i<=2){
                lord.add(t);
            }else if (i%3==2){
                player1.add(t);
            }else if (i%3==1){
                player2.add(t);
            }else {
                player3.add(t);
            }
        }

        lookPoker("底牌",lord);
        lookPoker("底牌",player1);
        lookPoker("底牌",player2);
        lookPoker("底牌",player3);
    }

    //看牌
    public void lookPoker(String name,TreeSet<Integer> p){
        System.out.println(name+":");
        for (Integer t:p){
            System.out.print(hm.get(t)+" ");
        }
        System.out.println();
    }
}
