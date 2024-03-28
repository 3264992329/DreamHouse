package OOPInnerclass;

public class Test {
    public static void main(String[] args) {
        Car c=new Car();
        c.getEngine();

        Car.Engine ce=new Car().new Engine();

        c.show("法利里拉法",1,"超级发动机",1);
    }
}
