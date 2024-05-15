package Thread_SaleTickets;

import java.util.concurrent.ArrayBlockingQueue;

public class MyThread {
    public static void main(String[] args) {

        Sale sale1=new Sale();
        Sale sale2=new Sale();

        sale1.setName("窗口一");
        sale2.setName("窗口二");

        sale1.start();
        sale2.start();
    }
}
