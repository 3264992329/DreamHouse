package bianma_jiema;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class 内容排序_简便方法 {
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
        Object[] array = Arrays.stream(split)
                .map(Integer::parseInt)//转换为int类型
                .sorted().//排序
                        toArray(Integer[]::new);
        //输出到新文件
        String s = Arrays.toString(array).replace(",","-");
        fileWriter.write(s.substring(1,s.length()-1));

        fileWriter.close();
        fileReader.close();
    }
}
