package abstractEXE;

public class Test {
    public static void main(String[] args) {
        student st=new student("徐涛",21);

        System.out.println(st.getName()+st.getAge());
        st.work();

        };
    }
