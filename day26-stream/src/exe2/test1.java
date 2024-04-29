package exe2;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"a-1","a-1","c-2","e-3","r-4","g-5","f-6");

        //����
        list.stream().filter(s -> s.length()==1).forEach(s -> {System.out.println(s);});
        System.out.println("===============================================");
        //��ȡǰ����Ԫ��
        list.stream().limit(3).forEach(s -> {System.out.println(s);});
        System.out.println("===============================================");
        //����ǰ����Ԫ��
        list.stream().skip(5).forEach(s -> {System.out.println(s);});
        System.out.println("===============================================");
        //Ԫ��ȥ��
        list.stream().distinct().forEach(s -> {System.out.println(s);});
        System.out.println("===============================================");
        //�ϲ�a��bΪһ����
        ArrayList<String> list1=new ArrayList<>();
        Collections.addAll(list1,"1","1","2","3","4","5","6");
        Stream.concat(list1.stream(),list.stream()).forEach(s -> {System.out.println(s);});
        System.out.println("===============================================");
        //ת�����е�����
        list.stream().map(s -> Integer.parseInt(s.split("-")[1])).forEach(s -> {System.out.println(s);});
        System.out.println("===============================================");
        //ͳ��
        System.out.println(list.stream().count());
        System.out.println("===============================================");
        //�ռ����е�����,�ŵ�������
        String[] array = list.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(array));
        System.out.println("===============================================");
        //�ռ���List���ϵ���
        ArrayList<String> list2=new ArrayList<>();
        Collections.addAll(list2,"��-1-����","��-5-����","Ů-18-֣����","��-3-������","Ů-2-С����","��-5-���Ź�","Ů-6-Ů����");
        List<String> collect1 = list2.stream().collect(Collectors.toList());
        System.out.println(collect1);
        System.out.println("===============================================");
        //�ռ���Set���ϵ���
        Set<String> collect = list2.stream().collect(Collectors.toSet());
        System.out.println(collect);
        System.out.println("===============================================");
        //�ռ���Map���ϵ���
        Map<String, String> collect2 = list2.stream().collect(Collectors.toMap(s -> s.split("-")[2], s -> s.split("-")[1]));
        System.out.println(collect2);
    }
}
