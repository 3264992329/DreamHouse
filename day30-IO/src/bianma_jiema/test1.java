package bianma_jiema;

public class test1 {
    public static void main(String[] args) {
        //����
        String str=new String("�����Ǵ�˧��!");
        byte[] bytes = str.getBytes();

        //����
        String str1=new String(str);
        System.out.println(str1);
    }
}
