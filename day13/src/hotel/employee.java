package hotel;

public class employee {
    private String id;
    private String name;
    private int salary;

    public employee() {
    }

    public employee(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
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
     * @return salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * 设置
     * @param salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "employee{id = " + id + ", name = " + name + ", salary = " + salary + "}";
    }

    public void work(){
        System.out.println("working");
    }

    public void eat(){
        System.out.println("eating");
    }
}
