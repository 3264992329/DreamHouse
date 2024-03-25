package hotel;

public class manger extends employee{
    private int jj;

    public manger() {
    }

    public manger(int jj,String id,String name,int salary) {
        super(id,name,salary);
        this.jj = jj;
    }

    @Override
    public void work(){
        System.out.println("managing");
    }

    /**
     * 获取
     * @return jj
     */
    public int getJj() {
        return jj;
    }

    /**
     * 设置
     * @param jj
     */
    public void setJj(int jj) {
        this.jj = jj;
    }

    public String toString() {
        return "manger{jj = " + jj + "}";
    }
}
