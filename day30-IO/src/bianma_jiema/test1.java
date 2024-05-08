package bianma_jiema;

public class test1 {
    public static void main(String[] args) {
        //±àÂë
        String str=new String("ĞìÌÎÊÇ´óË§±Æ!");
        byte[] bytes = str.getBytes();

        //½âÂë
        String str1=new String(str);
        System.out.println(str1);
    }
}
