package StringBuilder;

public class SB {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("肏屄");

        //添加元素
        sb.append(12222);
        //元素反转
        sb.reverse();
        //获取长度
        String sb2=sb.toString();

        int len=sb.length();
        System.out.println(sb);
    }
}
