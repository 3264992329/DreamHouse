package 泛型_案例1;

public class taidi extends dog{
    @Override
    public void eat() {
        System.out.println("一只叫做"+super.getName()+"的"+super.getAge()+"岁的泰迪正在吃骨头");
    }
}
