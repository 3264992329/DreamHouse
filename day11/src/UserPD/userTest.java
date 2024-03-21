package UserPD;

import java.util.ArrayList;
import java.util.Scanner;

public class userTest {
    public static void main(String[] args) {
        ArrayList<user> list=new ArrayList<>();

        user us1=new user("1","zjc","123");
        user us2=new user("2","xt","456");
        user us3=new user("3","zyx","789");

        list.add(us1);
        list.add(us2);
        list.add(us3);

        //输入需要判断的用户
        Scanner sc=new Scanner(System.in);
        user us4=new user();
        System.out.println("输入id:");
        String id= sc.next();
       /* System.out.println("输入账户名:");
        String username=sc.next();
        System.out.println("输入密码:");
        String password=sc.next();*/

        us4.setId(id);
        /*us4.setUsername(username);
        us4.setPassword(password);*/

        //调用方法判断
        System.out.println(pd(us4,list));
    }

    public static boolean pd(user us,ArrayList<user> list) {
        for (int i = 0; i < list.size(); i++) {
            user t=list.get(i);
            if (us.getId().equals(t.getId())){
                return true;
            }
        }
        return false;
    }
}
