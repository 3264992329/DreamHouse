package StudentList;

import java.util.ArrayList;

public class LIstTest {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();

        Student st1=new Student("zjc","girl",18);
        Student st2=new Student("zyx","boy",21);
        Student st3=new Student("lt","boy",20);
        Student st4=new Student("cl","boy",21);
        Student st5=new Student("wmc","boy",23);

        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)+";");
        }
    }
}
