package OOPInnerclass;

public class Car {
    String CarName;
    int CarAge;
    String CarColor;

    public void show(String CarName,int CarAge,String EngineName,int EngineAge){
        System.out.println(CarName);
        //外部类访问内部类需要创建对象
        Engine e=new Engine();
        System.out.println(e.EngineAge+" "+e.EngineName+" ");
        //Engine的show方法
        e.show();
    }

    public class Engine{
        String EngineName;
        int EngineAge;

        public void show(){
            System.out.println(EngineName);
            System.out.println(EngineAge);
            System.out.println(CarAge);
            System.out.println(CarName);
            System.out.println(CarColor);
        }
    }

    public Engine getEngine(){
        return new Engine();
    }
}
