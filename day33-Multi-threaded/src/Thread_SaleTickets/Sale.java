package Thread_SaleTickets;

public class Sale extends Thread{
    static int count=100;

    @Override
    public void run() {
            while (true){
                synchronized (Sale.class){
                    if (count>0){
                        count--;
                        System.out.println(getName()+"售出一张票,还剩"+count+"张票未售出");
                    }else {
                        System.out.println("票已售罄");
                        break;
                    }
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
        }
    }
}
