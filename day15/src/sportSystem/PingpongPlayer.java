package sportSystem;

public class PingpongPlayer extends Sporter implements English{
    public PingpongPlayer() {
    }

    public PingpongPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("学习打乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("说英语");
    }
}
