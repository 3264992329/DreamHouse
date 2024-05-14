package myThread;

public class MyThread extends  Thread{
    @Override
    public void run() {
        for (int i = 0; i <100; i++) {
            System.out.println(getName()+"徐涛大帅逼");
        }
    }
}
