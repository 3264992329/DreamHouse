package My_Exe_5;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list,5,10,20,50,100,200,500,800,2,80,300,700);

        MyThread t1=new MyThread(list);
        MyThread t2=new MyThread(list);

        t1.setName("抽奖箱1");
        t2.setName("抽奖箱2");

        t1.start();
        t2.start();
    }
}
