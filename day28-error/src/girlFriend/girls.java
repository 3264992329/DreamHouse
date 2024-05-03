package girlFriend;

public class girls {
    private String name;
    private int age;

    public girls() {
    }

    public girls(String name, int age) {
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
        if (name.length()<3||name.length()>10){
            throw new RuntimeException();
        }
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
        if (age>40||age<18){
            throw new RuntimeException();
        }
        this.age = age;
    }

    public String toString() {
        return "girls{name = " + name + ", age = " + age + "}";
    }
}
