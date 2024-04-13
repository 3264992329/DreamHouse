package 爬虫;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 贪婪爬取和非贪婪爬取 {
    //贪婪爬取:尽可能多的爬取数据
    //非贪婪爬取:尽可能少的爬取数据
    public static void main(String[] args) {
        String str1="abbbbbbbbda技能等级开发框架2askdajkfhkjhkjhkjJava11,Java8";
        //贪婪
        String regex1="ab+";
        //非贪婪
        String regex2="ab+?";
        Pattern p=Pattern.compile(regex2);
        Matcher m= p.matcher(str1);
        while (m.find()){
            System.out.println(m.group());
        }
    }
}
