package integerdemo;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int b=Integer.parseInt(a);
        ArrayList<String> list=toBinaryString(b);
        StringBuilder result= new StringBuilder();
        for (int i= list.size()-1;i>=0;i--){
            result.append(list.get(i));
        }
        System.out.println(result);
    }

    public static ArrayList<String> toBinaryString(int a) {
        ArrayList<String> list=new ArrayList<>();
        while (a>0){
            int i=a%2;
            list.add(String.valueOf(i));
            a=a/2;
        }
        return list;
    }
}
