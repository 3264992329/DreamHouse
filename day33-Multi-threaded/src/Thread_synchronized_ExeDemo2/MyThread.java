package Thread_synchronized_ExeDemo2;

public class MyThread {
    public static void main(String[] args) {
        MySynchronized ms=new MySynchronized();

        Thread t1=new Thread(ms);
        Thread t2=new Thread(ms);
        Thread t3=new Thread(ms);

        t1.start();
        t2.start();
        t3.start();

        t1.start();
        t2.start();
        t3.start();
    }
}
