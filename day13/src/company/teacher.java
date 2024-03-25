package company;

public class teacher extends employee{
    private String teach;

    public teacher() {
    }

    public teacher(String teach,String id,String name,int salary) {
        super(id,name,salary);
        this.teach = teach;
    }

    /**
     * 获取
     * @return teach
     */
    public String getTeach() {
        return teach;
    }

    /**
     * 设置
     * @param teach
     */
    public void setTeach(String teach) {
        this.teach = teach;
    }

    public String toString() {
        return "teacher{teach = " + teach + "}";
    }

    @Override
    public void work(){
        System.out.println("正在讲课");
    }
}
