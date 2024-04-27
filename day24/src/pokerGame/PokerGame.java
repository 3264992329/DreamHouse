package pokerGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;

public class PokerGame {

    //静态代码块
    //随着类的加载而加载,只执行一次
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
        poker.add("JOKER");
        poker.add("joker");
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

        lookPoker("底牌",dipai);
        lookPoker("player1",player1);
        lookPoker("player2",player2);
        lookPoker("player3",player3);
    }

    //发牌
    public void lookPoker(String name,ArrayList<String> p){
        System.out.print(name+":");
        System.out.println(p);
    }
}
