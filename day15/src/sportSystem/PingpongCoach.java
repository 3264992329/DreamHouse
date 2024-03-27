package sportSystem;

public class PingpongCoach extends Coach implements English{
    public PingpongCoach() {
    }

    public PingpongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教学生打乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("说英语");
    }
}
