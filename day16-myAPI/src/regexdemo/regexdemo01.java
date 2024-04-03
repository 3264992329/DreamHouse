package regexdemo;

public class regexdemo01 {
    public static void main(String[] args) {
        //正则表达式
        //"字符限制{字符数量}"
        System.out.println("l5df".matches("\\w{4,115}"));
    }
}
