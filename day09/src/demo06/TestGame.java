package demo06;

public class TestGame {
    public static void main(String[] args) {
        Role role1=new Role("郑某某",100,'女');
        Role role2=new Role("徐某",100,'男');

        role1.showRoleInfo();
        System.out.println("===============================");
        role2.showRoleInfo();
        System.out.println("===============================");
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
