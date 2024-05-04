package CustomExceptions;

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
        if (name.length()<3||name.length()>10){
            throw new formateLength(name+"姓名长度错误,应在3-10个字符以内");
        }
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
        if (age>40||age<18){
            throw new ageSize(age+"输入年龄格式有误,应在18-40之间,用数字表示");
        }
        this.age = age;
    }

    public String toString() {
        return "girls{name = " + name + ", age = " + age + "}";
    }
}
