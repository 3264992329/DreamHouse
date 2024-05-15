package Thread_synchronized_ExeDemo2;

public class MySynchronized implements Runnable{
    static int count=0;
    @Override
    public void run() {
        while (true){
            if (method()) break;
        }
    }

    private synchronized boolean method() {
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
        return false;
    }
}
