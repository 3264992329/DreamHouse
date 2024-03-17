package demo05;

public class TestGame {
    public static void main(String[] args) {
        Game role1=new Game("郑某某",100);
        Game role2=new Game("徐某",100);

        while (true){
            role1.Fight(role2);
            if (role2.getBlood()<=0){
                System.out.println(role1.getName()+"打败了"+role2.getName());
                break;
            }

            role2.Fight(role1);
            if (role1.getBlood()<=0){
                System.out.println(role2.getName()+"打败了"+role1.getName());
                break;
            }
        }
    }
}
