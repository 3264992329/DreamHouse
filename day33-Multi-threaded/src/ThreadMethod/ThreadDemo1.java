package ThreadMethod;

public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread t1=new myMethod1("美羊羊");
        Thread t2=new myMethod1("沸羊羊");

        //设置优先级
        t1.setPriority(5);
        t2.setPriority(5);

        //守护线程
        t2.setDaemon(true);
        t1.start();
        t2.start();

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
    }
}
