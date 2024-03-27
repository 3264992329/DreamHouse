package animal;

public class Sheep extends animal{
    public Sheep() {
    }

    public Sheep(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("山羊在咩咩叫");
    }
}
