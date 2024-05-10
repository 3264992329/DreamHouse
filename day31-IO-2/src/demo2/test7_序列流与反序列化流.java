package demo2;

import java.io.*;

public class test7_序列流与反序列化流 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        students stu=new students("徐涛",21);
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("C:\\Users\\86187\\Desktop\\大学\\javaDM\\day31-IO-2\\src\\abc.txt"));
        oos.writeObject(stu);
        oos.close();

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\Users\\86187\\Desktop\\大学\\javaDM\\day31-IO-2\\src\\abc.txt"));
        Object read = ois.readObject();
        System.out.println(read);
        ois.close();
    }
}
