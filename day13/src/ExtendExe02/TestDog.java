package ExtendExe02;

public class TestDog {
    public static void main(String[] args) {
        System.out.println("----------------");
        System.out.println("哈士奇:");
        Husky hs=new Husky();
        hs.eat();
        hs.drink();
        hs.breakHome();
        hs.lookHome();
        System.out.println("----------------");
        System.out.println("沙皮狗:");
        shaPi sp=new shaPi();
        sp.eat();
        sp.drink();
        sp.lookHome();
        System.out.println("----------------");
        System.out.println("田园犬:");
        tianYuan ty=new tianYuan();
        ty.eat();
        ty.drink();
        ty.lookHome();
    }
}
