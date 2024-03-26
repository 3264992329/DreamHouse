public class Test {
    public static void main(String[] args) {
        person ps=new person("徐涛",99);
        Dog dog=new Dog(10,"棕");
        Cat cat=new Cat(5,"橘");

        dog.lookHome();
        cat.work();

        ps.keepPet(cat,"鱼摆摆");
        ps.keepPet(dog,"骨头");
    }
}
