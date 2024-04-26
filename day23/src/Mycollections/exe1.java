package Mycollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class exe1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();

        System.out.println("----------addAll批量添加元素-------------");
        //批量添加元素
        Collections.addAll(list,"154","sda","query","sdf","loop");
        System.out.println(list);

        System.out.println("----------shuffle打乱集合元素-------------");
        //打乱集合元素
        Collections.shuffle(list);
        System.out.println(list);

        System.out.println("----------sort排序-------------");
        Collections.sort(list);
        System.out.println(list);

        System.out.println("----------sort指定规则排序-------------");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length()-o1.length();
            }
        });
        System.out.println(list);

        System.out.println("----------binarySearch二分查找-------------");
        //需要元素有序
        ArrayList<Integer> list2=new ArrayList<>();
        Collections.addAll(list2,1,2,3,4,5,6,7,8,9,10);
        int i = Collections.binarySearch(list2, 2);
        System.out.println(i);

        System.out.println("----------copy复制-------------");
        //当list>list1的长度,方法会报错
        ArrayList<String> list1=new ArrayList<>();
        Collections.addAll(list1,"115","45","dfa","sdad","fsfgs","dfsw");
        Collections.copy(list1,list);
        System.out.println(list1);

        System.out.println("----------自然排序活动max/min-------------");
        Integer max = Collections.max(list2);
        Integer min = Collections.min(list2);
        System.out.println(max);
        System.out.println(min);

        System.out.println("----------max/min指定规则-------------");
        String min1 = Collections.min(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println(min1);

        System.out.println("----------swap交换集合中指定位置的元素-------------");
        Collections.swap(list,0,3);
        System.out.println(list);

        System.out.println("----------fill使用指定元素填充集合-------------");
        Collections.fill(list,"6545");
        System.out.println(list);
    }
}
