package Thread_synchronized_ExeDemo1;

public class MyTickets extends Thread{
    //加上static关键字后,所有的对象共享一个ticket对象
    static int ticket=0;

    //锁对象一定要是唯一的
    static Object obj=new Object();
    @Override
    public void run() {
        while (true){

            synchronized (obj){
                if (ticket<=100){
                    ticket++;
                    System.out.println(getName()+"正在卖第"+ticket+"张票!!!");
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
