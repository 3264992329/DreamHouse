package 爬虫;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 字符串替换和截取 {
    public static void main(String[] args) {
        String str1="xksjalk可接受的老咔叽的看得见啊可是姐姐kd65sdak扣税的接口";
        String regex1="接受的老咔叽";
        String result=str1.replaceAll("老咔叽","大鸡鸡");
        System.out.println(result);
        String[] arr= str1.split(regex1);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
