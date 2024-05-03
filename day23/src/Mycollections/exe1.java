package Mycollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class exe1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();

        System.out.println("----------addAll��������Ԫ��-------------");
        //��������Ԫ��
        Collections.addAll(list,"154","sda","query","sdf","loop");
        System.out.println(list);

        System.out.println("----------shuffle���Ҽ���Ԫ��-------------");
        //���Ҽ���Ԫ��
        Collections.shuffle(list);
        System.out.println(list);

        System.out.println("----------sort����-------------");
        Collections.sort(list);
        System.out.println(list);

        System.out.println("----------sortָ����������-------------");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length()-o1.length();
            }
        });
        System.out.println(list);

        System.out.println("----------binarySearch���ֲ���-------------");
        //��ҪԪ������
        ArrayList<Integer> list2=new ArrayList<>();
        Collections.addAll(list2,1,2,3,4,5,6,7,8,9,10);
        int i = Collections.binarySearch(list2, 2);
        System.out.println(i);

        System.out.println("----------copy����-------------");
        //��list>list1�ĳ���,�����ᱨ��
        ArrayList<String> list1=new ArrayList<>();
        Collections.addAll(list1,"115","45","dfa","sdad","fsfgs","dfsw");
        Collections.copy(list1,list);
        System.out.println(list1);

        System.out.println("----------��Ȼ����max/min-------------");
        Integer max = Collections.max(list2);
        Integer min = Collections.min(list2);
        System.out.println(max);
        System.out.println(min);

        System.out.println("----------max/minָ������-------------");
        String min1 = Collections.min(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println(min1);

        System.out.println("----------swap����������ָ��λ�õ�Ԫ��-------------");
        Collections.swap(list,0,3);
        System.out.println(list);

        System.out.println("----------fillʹ��ָ��Ԫ����伯��-------------");
        Collections.fill(list,"6545");
        System.out.println(list);
    }
}