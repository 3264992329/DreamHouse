package My_Exe_5_3_Collable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list,5,10,20,50,100,200,500,800,2,80,300,700);

        MyThread mc=new MyThread(list);

        //创建运行结果管理对象
        FutureTask<Integer> ft1=new FutureTask<>(mc);
        FutureTask<Integer> ft2=new FutureTask<>(mc);

        Thread td1=new Thread(ft1);
        Thread td2=new Thread(ft2);

        td1.start();
        td2.start();

        Integer i = ft1.get();
        Integer i1 = ft2.get();

        System.out.println(i);
        System.out.println(i1);
    }
}
