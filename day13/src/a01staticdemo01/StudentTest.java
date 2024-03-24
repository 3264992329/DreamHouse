package a01staticdemo01;

public class StudentTest {
    public static void main(String[] args) {
        Student.teacher="阿苇老师";
        Student st1=new Student("张三",23,"男");
        st1.show();
        st1.study();

        Student st2=new Student("李四",24,"女");
        st2.show();
        st2.study();
    }
}
