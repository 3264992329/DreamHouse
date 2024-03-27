package animal;

public class Dog extends animal{

    public Dog(){

    }

    public  Dog(String name,int age){
        super(name,age);
    }
    @Override
    public void work() {
        System.out.println("豆豆在汪汪叫");
    }
}
