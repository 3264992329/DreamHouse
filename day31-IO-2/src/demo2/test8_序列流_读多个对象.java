package demo2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class test8_序列流_读多个对象 {
    public static void main(String[] args) throws IOException {
        students stu=new students("徐涛",21);
        students stu1=new students("郑吉翠",20);
        students stu2=new students("女儿",-6);

        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("C:\\Users\\86187\\Desktop\\大学\\javaDM\\day31-IO-2\\src\\ghi.txt"));

        ArrayList<students> list=new ArrayList<>();
        list.add(stu);
        list.add(stu1);
        list.add(stu2);

        oos.writeObject(list);
        oos.close();
    }
}
