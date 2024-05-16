package My_Exe_RedBag2;

public class test1 {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        MyThread t3=new MyThread();
        MyThread t4=new MyThread();
        MyThread t5=new MyThread();

        t1.setName("徐涛");
        t2.setName("刘涛");
        t3.setName("陈立");
        t4.setName("张雨潇");
        t5.setName("吴明聪");

        t4.start();
        t2.start();
        t5.start();
        t1.start();
        t3.start();
    }
}
