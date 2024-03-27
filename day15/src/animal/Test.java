package animal;

public class Test {
    public static void main(String[] args) {
        Frog f=new Frog("小青蛙",1);
        System.out.println(f.getName()+f.getAge());
        f.work();
        Dog d=new Dog("老狗狗",10);
        System.out.println(d.getName()+d.getAge());
        d.work();
        Sheep s=new Sheep("小山羊",6);
        System.out.println(s.getName()+s.getAge());
        s.work();
    }
}
