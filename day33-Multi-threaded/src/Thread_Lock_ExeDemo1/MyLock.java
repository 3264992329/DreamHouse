package Thread_Lock_ExeDemo1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyLock implements Runnable{
    static int count=0;
    static Lock lock=new ReentrantLock();
    @Override
    public void run() {
        while (true){
            if (method()) break;
        }
    }

    private boolean method() {
        lock.lock();
        try {
            if (count<=100){
                count++;
                System.out.println(Thread.currentThread().getName()+"已售出"+count+"张票");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }else {
                System.out.println("已售罄");
                return true;
            }
        } finally {
            lock.unlock();
        }

        return false;
    }
}
