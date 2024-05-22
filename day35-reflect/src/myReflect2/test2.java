package myReflect2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

public class test2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<?> aClass = Class.forName("myReflect2.student");

        /*
        //获取构造方法
        Constructor<?>[] cons1 = aClass.getConstructors();
        for (Constructor<?> constructor : cons1) {
            System.out.println(constructor);
        }
        */

        /*
        Constructor<?>[] dcs = aClass.getDeclaredConstructors();
        for (Constructor<?> dc : dcs) {
            System.out.println(dc);
        }
        */

        /*Constructor<?> dc1 = aClass.getDeclaredConstructor(String.class);
        System.out.println(dc1);*/

        Constructor<?> dc2 = aClass.getDeclaredConstructor(String.class, int.class);
        int modifiers = dc2.getModifiers();
        System.out.println(modifiers);

        Parameter[] parameters = dc2.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }

        dc2.setAccessible(true);
        student s1 =(student) dc2.newInstance("张三", 23);
        System.out.println(s1);
    }
}
