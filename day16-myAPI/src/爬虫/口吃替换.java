package 爬虫;

public class 口吃替换 {
    public static void main(String[] args) {
        // 我要学学学编编编编编程程程程程程程程程
        //替换为:   我要学编程
        String str1="我要学学学编编编编编程程程程程程程程程";
        // $序号 :  表示把前面第(序号)位的继续使用
        String str2=str1.replaceAll("(.)\\1+","$1");
        System.out.println(str2);

        //非捕获分组
        //下面的内容会报错,因为   ?: 是非捕获分组  因此\\1会报错
        //    ?=  ?:  ?! 都属于非捕获分组
        String regex2="\\d{6}(?:\\d|X|x)\\1";
        System.out.println("sdasfs".matches(regex2));
    }
}
