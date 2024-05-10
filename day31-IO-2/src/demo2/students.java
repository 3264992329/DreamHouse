package demo2;

import java.io.Serial;
import java.io.Serializable;

public class students implements Serializable {
    @Serial
    private static final long serialVersionUID = 5537108125173521117L;
    private String name;
    private int age;
    private int height;

    public students() {
    }

    public students(String name, int age) {
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
        return "students{name = " + name + ", age = " + age + "}";
    }
}
