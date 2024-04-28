package PokerGame2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.function.BiConsumer;

public class PokerGame {

    //��̬�����
    //������ļ��ض�����,ִֻ��һ��
    static HashMap<Integer,String> hm=new HashMap<>();
    static ArrayList<Integer> list=new ArrayList<>();
    static {
        //������
        String[] color={"����","����","����","÷��"};
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

    //ϴ��
    public PokerGame(){
        Collections.shuffle(list);
        TreeSet<Integer> lord=new TreeSet<>();
        TreeSet<Integer> player1=new TreeSet<>();
        TreeSet<Integer> player2=new TreeSet<>();
        TreeSet<Integer> player3=new TreeSet<>();
        for (int i = 0; i < hm.size(); i++) {
            //t�����ƵĴ�С
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

        lookPoker("����",lord);
        lookPoker("����",player1);
        lookPoker("����",player2);
        lookPoker("����",player3);
    }

    //����
    public void lookPoker(String name,TreeSet<Integer> p){
        System.out.println(name+":");
        for (Integer t:p){
            System.out.print(hm.get(t)+" ");
        }
        System.out.println();
    }
}
