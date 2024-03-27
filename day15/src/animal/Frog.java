package animal;

public class Frog extends animal{

    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("青蛙在哇哇叫");
    }
}
