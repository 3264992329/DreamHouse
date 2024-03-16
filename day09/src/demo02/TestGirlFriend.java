package demo02;

public class TestGirlFriend {
    public static void main(String[] args) {
        GirlFriend gf1=new GirlFriend();

        gf1.setName("小翠翠");;
        gf1.setGender("臭狗屎");;
        gf1.setAge(18);;
        gf1.sleep();
        gf1.eat();
        System.out.println(gf1.getName());
        System.out.println(gf1.getGender());
        System.out.println(gf1.getAge());

        GirlFriend gf2=new GirlFriend();
        gf2.setName("小涛涛");
        gf2.setGender("香狗屎");
        gf2.setAge(18);
        gf2.sleep();
        gf2.eat();
        System.out.println(gf2.getName());
        System.out.println(gf2.getAge());
        System.out.println(gf2.getGender());

    }
}
