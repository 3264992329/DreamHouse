package exe5;

public class students {
    private String name;
    private String gender;
    private int age;
    private double weight;

    public students() {
    }

    public students(String name, String gender, int age, double weight) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
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
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * ����
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
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

    /**
     * ��ȡ
     * @return weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * ����
     * @param weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String toString() {
        return "students{name = " + name + ", gender = " + gender + ", age = " + age + ", weight = " + weight + "}";
    }
}
