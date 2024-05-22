package myReflect1;

public class test1 {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取class对象的3种方法

        //method1
        Class<?> aClass = Class.forName("myReflect1.student");
        System.out.println(aClass);

        //method2
        Class<student> bClass = student.class;
        System.out.println(bClass);

        //method3
        student s=new student();
        Class<? extends student> cClass = s.getClass();
        System.out.println(cClass);


        System.out.println(aClass==cClass);
        System.out.println(bClass==aClass);

    }
}
