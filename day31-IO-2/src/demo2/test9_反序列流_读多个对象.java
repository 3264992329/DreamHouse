package demo2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class test9_��������_��������� {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\Users\\86187\\Desktop\\��ѧ\\javaDM\\day31-IO-2\\src\\ghi.txt"));
        Object o = ois.readObject();
        ArrayList<students> list=(ArrayList<students>) o;
        for (students students : list) {
            System.out.println(students);
        }
        ois.close();
    }
}
