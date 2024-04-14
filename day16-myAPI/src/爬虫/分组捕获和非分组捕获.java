package 爬虫;

public class 分组捕获和非分组捕获 {
    public static void main(String[] args) {
        //      \\主号 是将 主号的那一组拿出来再用一次
        String regex1="(.).+\\1";
        System.out.println("a12543a".matches(regex1));
        System.out.println(".............................");
        String regex2="(.+).+\\1";
        System.out.println("aaa123aaa".matches(regex2));
        System.out.println(".............................");
        //判断首尾是否相同

        //  *代表0次或者多次
        String regex3="((.)\\2*).+\\1";
        System.out.println("aaa123554659966666aaa".matches(regex3));
    }
}
