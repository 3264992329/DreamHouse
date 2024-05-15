package Thread_Lock_ExeDemo1;

public class MyThread {
    public static void main(String[] args) {
        MyLock ms=new MyLock();

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
