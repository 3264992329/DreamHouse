package StringBuilder;

import java.util.StringJoiner;

public class 两个字符串的数字相乘求结果 {
    public static void main(String[] args) {
        String a="12345";
        String b="236";

        int result=toString(a)*toString(b);
        System.out.println(result);
    }

    public static int toString(String t) {
        StringBuilder sb=new StringBuilder();
        String temp=sb.append(t).reverse().toString();
        int result=0;
        for (int i = 0; i < t.length(); i++) {
            int c=temp.charAt(i)-48;
            result=result*10+c;
        }

        return result;
    }
}
