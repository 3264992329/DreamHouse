package bianma_jiema;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class 内容排序 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader=new FileReader("C:\\Users\\86187\\Desktop\\大学\\javaDM\\day30-IO\\src\\number.txt");
        FileWriter fileWriter=new FileWriter("C:\\Users\\86187\\Desktop\\大学\\javaDM\\day30-IO\\src\\number1.txt");

        //取出数据源
        StringBuilder sb=new StringBuilder();
        int b;
        while ((b=fileReader.read())!=-1){
            sb.append((char) b);
        }
        String string = sb.toString();
        String[] split = string.split("-");
        //数据排序
        ArrayList<Integer> list=new ArrayList<>();
        for (String s : split) {
            list.add(Integer.parseInt(s));
        }
        Collections.sort(list);
        //输出到新文件
        for (int i = 0; i < list.size(); i++) {
            if (i==list.size()-1){
                fileWriter.write(list.get(i)+"");
            }else {
                fileWriter.write(list.get(i)+"-");
            }
        }
        System.out.println(list);

        fileWriter.close();
        fileReader.close();
    }
}
