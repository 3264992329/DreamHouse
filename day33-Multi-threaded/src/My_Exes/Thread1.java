package My_Exes;

public class Thread1 extends Thread{
    static int count=1;

    @Override
    public void run() {
        while (true){
            synchronized (Thread.class){
                if (count>100){
                    break;
                }else {
                    if (count%2==1){
                        System.out.println(getName()+count);
                        count++;
                    }else {
                        count++;
                    }
                }
            }
        }
    }
}
