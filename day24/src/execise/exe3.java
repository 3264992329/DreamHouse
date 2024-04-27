package execise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class exe3 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"徐涛","郑吉翠","刘涛","陈立","刘国州","张雨潇","吴明聪");
        int sum=list.size();

        //用于存储已被抽取的学生
        ArrayList<String> list1=new ArrayList<>();

        Random rd=new Random();

        for (int j = 1; j <= 10; j++) {
            System.out.println("------第"+j+"轮------");
            for (int i = 0; i < sum; i++) {
                int t= rd.nextInt(list.size());
                String temp=list.remove(t);
                list1.add(temp);
                System.out.println(temp);
            }
            list.addAll(list1);
            list1.clear();
        }

    }
}
