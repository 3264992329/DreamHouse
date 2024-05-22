package myReflect3;

import java.lang.reflect.Field;

public class test3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Class<?> aClass = Class.forName("myReflect3.student");

        //获取所有成员变量
        /*Field[] fields = aClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }*/

        Field name = aClass.getDeclaredField("name");
        System.out.println(name);

        System.out.println(name.getName());
        System.out.println(name.getType());

        //获取成员变量记录的值
        student s1 = new student("张三", 23, "男");
        name.setAccessible(true);
        Object o = name.get(s1);
        System.out.println(o);

        //修改记录的值
        name.set(s1,"李四");
        System.out.println(s1);

    }
}
