package ���ù��췽��;

public class student {
    private String name;
    private int age;

    public student() {
    }

    public student(String str) {
        this.name=str.split(",")[0];
        this.age=Integer.parseInt(str.split(",")[1]);
    }

    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * ��ȡ
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * ����
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * ��ȡ
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * ����
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "student{name = " + name + ", age = " + age + "}";
    }
}
