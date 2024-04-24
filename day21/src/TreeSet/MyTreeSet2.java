package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class MyTreeSet2 {
    public static void main(String[] args) {
        student2 st=new student2("zs",21,59,66,69);
        student2 st1=new student2("ls",12,65,86,91);
        student2 st2=new student2("ww",29,57,66,39);
        student2 st3=new student2("zl",11,15,96,47);

        TreeSet<student2> ts=new TreeSet<>();
        ts.add(st);
        ts.add(st1);
        ts.add(st2);
        ts.add(st3);
        System.out.println(ts);
        Iterator<student2> iterator = ts.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
