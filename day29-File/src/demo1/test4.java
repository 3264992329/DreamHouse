package demo1;

import java.io.File;

public class test4 {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\86187\\Desktop\\123\\aaa\\bbb\\ccc\\ddd\\eee\\fff");
        boolean delete = file.delete();
        System.out.println(delete);
    }
}
