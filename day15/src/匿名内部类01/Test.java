package 匿名内部类01;

public class Test {
    public static void main(String[] args) {
        method(
                new Swim(){
            @Override
            public void swim() {
                System.out.println("狗在游泳");
            }
        }
                );

    }

    public static void method(Swim s){
        s.swim();
    }

}
