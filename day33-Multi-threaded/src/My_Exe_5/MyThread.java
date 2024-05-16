package My_Exe_5;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends Thread{
    ArrayList<Integer> list;

    public MyThread(ArrayList<Integer> list) {
        this.list=list;
    }

    @Override
    public void run() {
        while (true){
            synchronized (MyThread.class){
                if (list.size()!=0){
                    //打乱数据
                    Collections.shuffle(list);
                    System.out.println(getName()+"抽到了"+list.get(0)+"元大奖");
                    list.remove(0);
                }else {
                    System.out.println("抽奖结束!!");
                    break;
                }
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
