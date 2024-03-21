package StudentTestPlus;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Scanner;

public class ListTestPlus {
    public static void main(String[] args) {
        ArrayList<StudentPlus> list= new ArrayList<>();
        Scanner sc=new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            StudentPlus st=new StudentPlus();
            System.out.println("请输入姓名:");
            String name= sc.next();
            System.out.println("请输入性别");
            String gender= sc.next();
            System.out.println("请输入年龄");
            int age= sc.nextInt();

            st.setName(name);
            st.setGender(gender);
            st.setAge(age);

            list.add(st);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
