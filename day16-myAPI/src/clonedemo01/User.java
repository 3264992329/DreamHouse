package clonedemo01;

import java.util.StringJoiner;


//Cloneable是一个标记类,如果Cloneable表示一旦实现,那么当前类的对象就可以被克隆
//如果没有实现,那么当前类不能被克隆
public class User implements Cloneable{
    private String name;
    private int id;
    private int[] data;

    public User() {
    }

    public User(String name, int id, int[] data) {
        this.name = name;
        this.id = id;
        this.data = data;
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
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return data
     */
    public int[] getData() {
        return data;
    }

    /**
     * 设置
     * @param data
     */
    public void setData(int[] data) {
        this.data = data;
    }

    public String toString() {
        return "User{name = " + name + ", id = " + id + ", data = " + arrToString() + "}";
    }

    public String arrToString(){
        StringJoiner sj=new StringJoiner(",","[","]");
        for (int i = 0; i < data.length; i++) {
            sj.add(data[i]+"");
        }
        return sj.toString();
    }

    public User clone() throws CloneNotSupportedException {
        int[] data=this.data;
        int[] newDate=new int[data.length];
        for (int i = 0; i < data.length; i++) {
            newDate[i]=data[i];
        }
        User u= (User) super.clone();
        u.data=newDate;
        return u;
    }
}
