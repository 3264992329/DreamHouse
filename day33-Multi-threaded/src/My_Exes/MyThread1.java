package My_Exes;

public class MyThread1 {
    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        Thread1 t2=new Thread1();

        t1.setName("一号-----");
        t2.setName("二号-----");

        t1.start();
        t2.start();
    }
}
