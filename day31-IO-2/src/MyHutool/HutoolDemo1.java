package MyHutool;

import cn.hutool.core.io.FileUtil;

import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class HutoolDemo1 {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\86187\\Desktop\\abc.txt");
        ArrayList<String> list=new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        FileUtil.appendLines(list,file, Charset.forName("UTF-8"));
        ArrayList<String> list1 = FileUtil.readLines(file, "UTF-8", new ArrayList<String>());
        System.out.println(list1);
    }
}
