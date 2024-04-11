package 爬虫;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexdemo02 {
    public static void main(String[] args) {
        String str="java12i十大科技和java2dsadakjjava54sdajdhakjhfjhdfajava98";
        Pattern p=Pattern.compile("java\\d{0,2}");
        Matcher m= p.matcher(str);
        while (m.find()){
            String s= m.group();
            System.out.println(s);
        }
    }
}
