package company;

public class adminStaff extends employee{
    private String admin;

    public adminStaff() {
    }

    public adminStaff(String admin,String id,String name,int salary) {
        super(id, name, salary);
        this.admin = admin;
    }

    /**
     * 获取
     * @return admin
     */
    public String getAdmin() {
        return admin;
    }

    /**
     * 设置
     * @param admin
     */
    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String toString() {
        return "adminStaff{admin = " + admin + "}";
    }

    @Override
    public void work(){
        System.out.println("正在管理");
    }
}
