package toStringdemo01;


public class ToString01 {
    public static void main(String[] args) {
        User u1=new toStringdemo01.User("徐涛",21);
        User u2=new User("郑某某",21);
        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u1.equals(u2));
    }
}
