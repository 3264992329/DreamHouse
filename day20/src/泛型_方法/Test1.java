package 泛型_方法;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        MyMethod.addAll(list,"sda","sd","gjj","yyj","qso");
        System.out.println(list);
    }
}
