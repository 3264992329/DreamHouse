package Thread_CookAndFoodie_ExeDemo1;

public class MyThread {
    public static void main(String[] args) {
        //创建线程对象
        Cook cook=new Cook();
        Foodie foodie=new Foodie();

        cook.setName("厨师");
        foodie.setName("吃货");

        foodie.start();
        cook.start();
    }
}
