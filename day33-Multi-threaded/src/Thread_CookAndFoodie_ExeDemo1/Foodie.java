package Thread_CookAndFoodie_ExeDemo1;

public class Foodie extends Thread{
    @Override
    public void run() {
        /*
         * 1.循环
         * 2.同步代码块
         * 3.检查是否有面条
         * 4.有就执行主要代码
         * 5.没有就wait()
         * */
        while (true){

            synchronized (desk.lock){

                if (desk.count==0){
                    break;
                }else {
                    if (desk.foodNumber==0){
                        try {
                            desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }else {
                        //吃掉食物
                        desk.count--;
                        System.out.println("美食家吃掉了第"+(10-desk.count)+"份面条");
                        //唤醒lock的所有持有者
                        desk.lock.notifyAll();
                        //修改桌子状态
                        desk.foodNumber=0;
                    }

                }
            }

        }
    }


}
