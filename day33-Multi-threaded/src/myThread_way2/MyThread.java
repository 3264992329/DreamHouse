package myThread_way2;

public class MyThread {
    public static void main(String[] args) {
        //先创建需要执行的任务
        MyRun mr=new MyRun();
        //创建线程对象
        Thread t1=new Thread(mr);
        Thread t2=new Thread(mr);
        //取名
        t1.setName("徐涛");
        t2.setName("郑吉翠");
        //开始线程
        t1.start();
        t2.start();
    }
}
