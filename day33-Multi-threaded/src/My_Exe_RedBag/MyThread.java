package My_Exe_RedBag;

import java.util.Random;

public class MyThread extends Thread{
    static double allMoneys=100.0;
    static int count=3;
    static final double min=0.01;

    @Override
    public void run() {
        synchronized (MyThread.class){
            //判断是否已经抢完,未抢完
            if (count>0){
                if (count==1){
                    System.out.println(getName()+"抢到了"+allMoneys+"元");
                    allMoneys=0;
                    count=0;
                }else {
                    Random rd=new Random();
                    //找到一个真确的红包值
                    while (true){
                        double money=rd.nextDouble(allMoneys-(count-1)*min);
                        if (money>=min&&money<allMoneys){
                            System.out.println(getName()+"抢到了"+money+"元");
                            //更新剩余的钱
                            allMoneys=allMoneys-money;
                            count--;
                            break;
                        }
                    }
                }

            }else {
                //判断是否已经抢完,已抢完
                System.out.println(getName()+"没抢到红包");
            }
        }
    }
}
