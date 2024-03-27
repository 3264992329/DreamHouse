package sportSystem;

public class Test {
    public static void main(String[] args) {
        System.out.println("------------------------------------");
        PingpongCoach pc=new PingpongCoach("徐涛",21);
        pc.teach();
        pc.speak();
        System.out.println("教练:"+pc.getName()+" "+"年龄"+pc.getAge());

        System.out.println("------------------------------------");
        BasketballCoach bc=new BasketballCoach("刘涛",21);
        bc.teach();
        System.out.println("教练:"+bc.getName()+" "+"年龄"+bc.getAge());

        System.out.println("------------------------------------");
        PingpongPlayer pp=new PingpongPlayer("张雨潇",20);
        pp.study();
        pc.speak();
        System.out.println("学员:"+pp.getName()+" "+"年龄:"+pp.getAge());

        System.out.println("------------------------------------");
        BasketballPlayer bp=new BasketballPlayer("吴明聪",22);
        bp.study();
        System.out.println("学员:"+bp.getName()+" "+"年龄:"+bp.getAge());
        System.out.println("------------------------------------");
    }
}
