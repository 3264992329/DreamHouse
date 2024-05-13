package myiotest1;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
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

        // 姓名-性别-男 构造最终假数据
        ArrayList<String> endName= result(girllist,boylist,allFamilylist,50,70);
        Collections.shuffle(endName);
        System.out.println(endName);

        //最后将假数据写到文件中
        File file=new File("C:\\Users\\86187\\Desktop\\大学\\javaDM\\day32-IOExercise\\fakeName.txt");
        BufferedWriter bw=new BufferedWriter(new FileWriter(file));
        for (String string : endName) {
            bw.write(string);
            bw.newLine();//换行
        }
        bw.close();
    }

    private static ArrayList<String> result(ArrayList<String> girllist, ArrayList<String> boylist, ArrayList<String> allFamilylist,int girlsNumber,int boysNumber) {
        //拼接名字---------------------------------------------------------
        Random rd=new Random();
        HashSet<String> allName=new HashSet<>();
        //打乱数据
        Collections.shuffle(girllist);
        Collections.shuffle(boylist);
        Collections.shuffle(allFamilylist);

            for (int i1 = 0; i1 < girllist.size(); i1++) {
                allName.add(allFamilylist.get(i1)+girllist.get(i1)+"-女");
            }
            //再次打乱数据
        Collections.shuffle(allFamilylist);
            for (int i1 = 0; i1 < boylist.size(); i1++) {
                allName.add(allFamilylist.get(i1)+boylist.get(i1)+"-男");
            }

            //将数据转移到ArrayList<String>中
        ArrayList<String> list=new ArrayList<>();
        for (String s : allName) {
            int age = rd.nextInt(18)+10;
            list.add(s+"-"+age);
        }
        return list;
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
