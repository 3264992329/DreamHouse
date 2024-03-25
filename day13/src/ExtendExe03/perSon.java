package ExtendExe03;

public class perSon {
    String name;
    int age;

    public perSon() {
        System.out.println("父类无参构造");
    }

    public perSon(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "perSon{name = " + name + ", age = " + age + "}";
    }
}
