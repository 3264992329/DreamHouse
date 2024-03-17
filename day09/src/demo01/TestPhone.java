package demo01;

public class TestPhone {
    public static void main(String[] args) {
        phone p=new phone();
        p.brand="iphone";
        p.price=6300;

        System.out.println(p.brand);
        System.out.println(p.price);

        p.call();
        p.playGame();
    }
}
