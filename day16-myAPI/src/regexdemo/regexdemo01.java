package regexdemo;

public class regexdemo01 {
    public static void main(String[] args) {
        //正则表达式
        //"字符限制{字符数量}"
        System.out.println("l5df".matches("\\w{4,115}"));
        String regex1="1[3-9]\\d{6}";
        System.out.println("15645645459".matches(regex1));
        System.out.println("-------------------");
        String regex2="\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";
        System.out.println("3265645@qq.com.cn".matches(regex2));
        System.out.println("-------------------");
        String regex3="\\w{4,16}";
        System.out.println("zhangsan".matches(regex3));
        System.out.println("-------------------");
        String regex4="[1-9]\\d{16}(\\d|x|X)";
        System.out.println("21565456545654897X".matches(regex4));
        System.out.println("-------------------");
        String regex5="[1,9]\\d{5}(18|19|20)\\d{2}(0[1,9]|10|11|12)(0[1,9]|[12]\\d|3[01])\\d{3}([\\d|(?i)x])";
        System.out.println("510722200207313315".matches(regex5));
    }
}
