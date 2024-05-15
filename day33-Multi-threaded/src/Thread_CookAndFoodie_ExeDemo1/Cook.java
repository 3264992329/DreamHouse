package Thread_CookAndFoodie_ExeDemo1;

public class Cook extends Thread{
    @Override
    public void run() {
        while (true){

            synchronized (desk.lock){

                if (desk.count==0){
                    break;
                }else {
                    if (desk.foodNumber==1){
                        try {
                            desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }else {
                        //做面条
                        System.out.println("厨师做了第"+(10-desk.count+1)+"碗面条");
                        desk.foodNumber=1;
                        //唤醒所有锁的持有者
                        desk.lock.notifyAll();
                    }
                }

            }

        }
    }
}
