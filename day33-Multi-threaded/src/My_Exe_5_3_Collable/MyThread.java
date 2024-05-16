package My_Exe_5_3_Collable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

public class MyThread implements Callable<Integer> {
    ArrayList<Integer> list;
    public MyThread(ArrayList<Integer> list) {
        this.list=list;
    }

    @Override
    public Integer call() throws Exception {
        int max2;
        ArrayList<Integer> list1=new ArrayList<>();
        while (true){
            synchronized (MyThread.class){
                if (list.size()!=0){
                    //打乱数据
                    Collections.shuffle(list);
                    //System.out.println(getName()+"抽到了"+list.get(0)+"元大奖");
                    Integer temp = list.get(0);
                    //向list1中添加元素
                    list1.add(temp);
                    //移除已抽取过的
                    list.remove(0);
                }else {
                    //抽奖箱
                    StringBuilder str2= new StringBuilder();
                    int all2=0;
                    max2=0;
                    for (Integer l2 : list1) {
                        str2.append(l2).append(",");
                        all2=all2+l2;
                        if (max2<l2){
                            max2=l2;
                        }
                    }
                    System.out.println(Thread.currentThread().getName()+"中得奖项"+str2+",最高奖为"+max2+",共中得"+all2+"元");
                    System.out.println("抽奖结束!!");
                    break;
                }
            }
        }
        Thread.sleep(100);

        return max2;
    }
}
