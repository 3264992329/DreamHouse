package 爬虫;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexdemo03 {
    public static void main(String[] args) {
        String str1="java5Java17654dsaJava11sdjauhda就是大Java8";
        //只显示Java不显示版本号
        String regex1="((?i)Java)(?=11|8|17)";
        //查询带有版本号的Java
        String regex2="((?i)Java)(8|11|17)";
        String regex3="((?i)Java)(?:8|11|17)";
        //不查询带有版本号的Java
        String regex4="((?i)Java)(?!8|11|17)";
        Pattern p=Pattern.compile(regex3);
        Matcher m=p.matcher(str1);
        while (m.find()){
            System.out.println(m.group());
        }
    }
}
