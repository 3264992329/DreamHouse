package myThread_way3_Callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class myThread {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable mc=new MyCallable();
        FutureTask<Integer> task = new FutureTask<>(mc);
        Thread t1=new Thread(task);
        t1.start();
        Integer i = task.get();
        System.out.println(i);
    }
}
