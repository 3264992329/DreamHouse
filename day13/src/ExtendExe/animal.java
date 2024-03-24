package ExtendExe;

public class animal {

    //子类只能访问父类中非私有成员成员
    //有private修饰的就不能访问
    public void eat(){
        System.out.println("在吃东西");
    }

    public void drink(){
        System.out.println("在合适");
    }
}
