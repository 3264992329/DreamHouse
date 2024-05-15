package Thread_synchronized_ExeDemo1;

public class myThread {
    public static void main(String[] args) {
        MyTickets mt1=new MyTickets();
        MyTickets mt2=new MyTickets();
        MyTickets mt3=new MyTickets();

        mt1.setName("①号售票窗口");
        mt2.setName("②号售票窗口");
        mt3.setName("③号售票窗口");

        mt1.start();
        mt2.start();
        mt3.start();
    }
}
