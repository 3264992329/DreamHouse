package demo2;

import java.io.*;

public class test7_�������뷴���л��� {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        students stu=new students("����",21);
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("C:\\Users\\86187\\Desktop\\��ѧ\\javaDM\\day31-IO-2\\src\\abc.txt"));
        oos.writeObject(stu);
        oos.close();

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\Users\\86187\\Desktop\\��ѧ\\javaDM\\day31-IO-2\\src\\abc.txt"));
        Object read = ois.readObject();
        System.out.println(read);
        ois.close();
    }
}
