package My_Exe_RedBag2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class MyThread extends Thread{
    static BigDecimal allMoneys=BigDecimal.valueOf(100.0);
    static int count=3;
    static final BigDecimal min=BigDecimal.valueOf(0.01);

    @Override
    public void run() {
        synchronized (MyThread.class){
            //判断是否已经抢完,未抢完
            if (count>0){
                if (count==1){
                    System.out.println(getName()+"抢到了"+allMoneys+"元");
                    allMoneys= BigDecimal.valueOf(0);
                    count=0;
                }else {
                    Random rd=new Random();
                    //找到一个真确的红包值
                    while (true){
                        BigDecimal money= BigDecimal.valueOf(rd.nextDouble(allMoneys.subtract(BigDecimal.valueOf(count-1)).multiply(min).doubleValue()));
                        if (money.doubleValue()>=min.doubleValue()&&money.doubleValue()<allMoneys.doubleValue()){
                            money=money.setScale(2, RoundingMode.HALF_UP);
                            System.out.println(getName()+"抢到了"+money+"元");
                            //更新剩余的钱
                            allMoneys=allMoneys.subtract(money);
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
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
