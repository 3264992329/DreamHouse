package myThread;

public class threadDemo1 {
    public static void main(String[] args) {
        MyThread m1=new MyThread();
        m1.setName("刘涛说:");
        m1.start();
        MyThread m2=new MyThread();
        m2.setName("陈立说:");
        m2.start();
    }
}
