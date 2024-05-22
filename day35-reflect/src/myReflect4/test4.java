package myReflect4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class test4 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> aClass = Class.forName("myReflect4.student");
/*
        //获取里面所有的方法对象(包含父类中所有的公共方法)
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
*/
        /*
        //获取里面所有的方法对象(不能获取父类,但可以获取本类中私有的方法)
        Method[] methods1 = aClass.getDeclaredMethods();
        for (Method method : methods1) {
            System.out.println(method);
        }
         */

        //获取指定单一方法
        Method eat = aClass.getMethod("eat", String.class);
        System.out.println(eat);

        //获取方法的修饰符
        String name = eat.getName();
        System.out.println(name);

        //获取方法的形参
        Parameter[] parameters = eat.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }

        //获取方法的抛出异常
        Class<?>[] exceptionTypes = eat.getExceptionTypes();
        for (Class<?> exceptionType : exceptionTypes) {
            System.out.println(exceptionType);
        }

        student student = new student();

        //
        Object result = eat.invoke(student, "奥里给");
        System.out.println(result);
    }
}
