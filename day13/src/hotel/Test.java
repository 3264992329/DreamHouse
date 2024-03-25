package hotel;

public class Test {
    public static void main(String[] args) {
        System.out.println("---------经理----------");
        manger mr=new manger(50000,"111","徐涛",9999);
        mr.work();
        mr.eat();

        System.out.println(mr.getId()+" "+mr.getName()+" "+mr.getSalary()+" "+mr.getJj());

        System.out.println("---------厨师----------");
        cook ck=new cook("222","郑某某",88888);
        ck.work();
        ck.eat();

        System.out.println(ck.getId()+" "+ck.getName()+" "+ck.getSalary());
    }
}
