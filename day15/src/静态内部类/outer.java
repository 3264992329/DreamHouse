package 静态内部类;

public class outer {
    private String name;

    static class inner{
        public void show1(){
            System.out.println("静态内部类1");
        }

        public static void show2(){
            System.out.println("静态内部类2");
        }
    }
}
