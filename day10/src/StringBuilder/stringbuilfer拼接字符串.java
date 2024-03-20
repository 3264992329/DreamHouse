package StringBuilder;

import java.util.Scanner;

public class stringbuilfer拼接字符串 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] a=new String[5];
        for (int i = 0; i < a.length; i++) {
            a[i]= sc.next();
        }
        System.out.println(arrToString(a));
    }

    public static String arrToString(String[] arr) {
        StringBuilder result=new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            result=result.append(arr[i]);
        }
        result=result.append("]");
        return result.toString();
    }
}
