package demo03;

public class Student {
    private String name;
    private int age;
    public Student(){
        System.out.println("看看我执行否?");
    }
    public Student(String name,int age){
        System.out.println("姓名:"+name);
        System.out.println("年龄:"+age);
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public String getName() {
        return name;
    }
}
