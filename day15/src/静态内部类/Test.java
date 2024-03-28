package 静态内部类;

public class Test {
    public static void main(String[] args) {
        outer.inner oi= new outer.inner();
        oi.show1();

        outer.inner.show2();
    }
}
