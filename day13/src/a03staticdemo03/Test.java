package a03staticdemo03;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();

        Student st1=new Student("徐涛",21,"男");
        Student st2=new Student("刘涛",22,"男");
        Student st3=new Student("张雨潇",20,"女");

        list.add(st1);
        list.add(st2);
        list.add(st3);

        System.out.println(Tool.getMaxAge(list));
    }
}
