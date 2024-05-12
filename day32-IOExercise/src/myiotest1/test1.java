package myiotest1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test1 {
    public static void main(String[] args) throws IOException {
        //定义变量记录网址
        String allFamilyNet="https://hanyu.baidu.com/shici/detail?from=aladdin&pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d";
        String boyNameNet="http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet="http://www.haoming8.cn/baobao/7641.html";
        //爬取数据
        String s = webCrawler(allFamilyNet);
        String s1 = webCrawler(boyNameNet);
        String s2 = webCrawler(girlNameNet);
        //System.out.println(s);
        //System.out.println(s1);
        //System.out.println(s2);
        //正则表达式过滤
        //获取百家姓
        String filter1="([\\u4e00-\\u9fa5·]{4})(，|。)";
        ArrayList<String> getData= getData(s,filter1,1);//0获取全部内容,1获取前面的内容,2获取后面的内容
        //System.out.println(getData);
        /*for (String string : getData) {
            System.out.println(string);
        }*/

        //获取男生的名字
        String filter2="([\\u4e00-\\u9fa5·]{2})(、|。)";
        ArrayList<String> getData2= getData(s1,filter2,1);//0获取全部内容,1获取前面的内容,2获取后面的内容
        //System.out.println(getData2);
        /*for (String string : getData2) {
            System.out.println(string);
        }*/

        //获取女生名字
        String filter3="(.. ){4}..";
        ArrayList<String> getData3= getData(s2,filter3,0);//0获取全部内容,1获取前面的内容,2获取后面的内容
        //System.out.println(getData3);
        /*for (String string : getData3) {
            System.out.println(string);
        }*/
        //System.out.println("---------------------------------------------------------");

        //处理数据
        //拆分百家姓
        ArrayList<String> allFamilylist=new ArrayList<>();
        for (String str : getData) {
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                allFamilylist.add(c+"");
            }
        }
        System.out.println(allFamilylist);
        //处理男生名字
        ArrayList<String> boylist=new ArrayList<>();
        for (String str : getData2) {
            if (!boylist.contains(str)){
                boylist.add(str);
            }
        }
        System.out.println(boylist);
        //处理女生名字
        ArrayList<String> girllist=new ArrayList<>();
        for (String str : getData3) {
            for (int i = 0; i < str.split(" ").length; i++) {
                girllist.add(str.split(" ")[i]);
            }
        }
        System.out.println(girllist);

        //拼接名字---------------------------------------------------------
        Random rd=new Random();
        ArrayList<String> girlName=new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            String a=allFamilylist.get(rd.nextInt(allFamilylist.size()));
            String b=girllist.get(rd.nextInt(girllist.size()));
            girlName.add(a+b);
        }
        System.out.println(girlName);
        ArrayList<String> boyName=new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            String a=allFamilylist.get(rd.nextInt(allFamilylist.size()));
            String b=boylist.get(rd.nextInt(boylist.size()));
            boyName.add(a+b);
        }
        System.out.println(boyName);
    }
    //正则表达式过滤----------------------------------------------------------------------
    private static ArrayList<String> getData(String s, String filter ,int index) {
        ArrayList<String> list=new ArrayList<>();
        Pattern pattern = Pattern.compile(filter);
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()){
            list.add(matcher.group(index));
        }
        return list;
    }
    //爬取网页-----------------------------------------------------------------------------
    public static String webCrawler(String net) throws IOException {
        StringBuilder sb=new StringBuilder();
        //创建一个URL对象
        URL url = new URL(net);
        //连接上网络
        URLConnection urlConn = url.openConnection();
        InputStreamReader isr= new InputStreamReader(urlConn.getInputStream(),"UTF-8");
        BufferedReader bf=new BufferedReader(isr);
        String b;
        while ((b=bf.readLine())!=null){
            sb.append(b);
        }
        bf.close();
        isr.close();
        return sb.toString();
    }
}
