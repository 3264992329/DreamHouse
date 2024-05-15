package Thread_BlockingQueue_ExeDemo1;

import java.util.concurrent.ArrayBlockingQueue;

public class Cook extends Thread{
    ArrayBlockingQueue<String> queue;
    public Cook(ArrayBlockingQueue<String> queue){
        this.queue=queue;
    }
    @Override
    public void run() {
        while (true){
            try {
                queue.put("狗屎");
                System.out.println("厨师放了依托答辩");
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
