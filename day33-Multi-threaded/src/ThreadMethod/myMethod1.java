package ThreadMethod;

public class myMethod1 extends Thread{
    public myMethod1() {
        super();
    }

    public myMethod1(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            //线程休眠
            /*try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }*/
            //出让线程
            Thread.yield();
            System.out.println(getName()+"@"+i);
        }
    }
}
