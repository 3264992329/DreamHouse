package myThread_way3_Callable;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int a=1;
        for (int i = 0; i < 100; i++) {
            a=a+1;
        }
        return a;
    }
}
