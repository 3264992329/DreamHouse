package myThread_way2;

public class MyRun implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+":徐涛是大帅逼");
        }
    }
}
