package Thread_BlockingQueue_ExeDemo1;

import java.util.concurrent.ArrayBlockingQueue;

public class MyThread {
    public static void main(String[] args) {
        //创建一个阻塞队列
        ArrayBlockingQueue<String> queue=new ArrayBlockingQueue<>(1);

        Cook cook=new Cook(queue);
        Foodie foodie=new Foodie(queue);

        cook.start();
        foodie.start();
    }
}
