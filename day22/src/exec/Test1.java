package exec;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test1 {
    //hashMap如果存储的是自定义对象,需要重写hashcode()和equals方法
    public static void main(String[] args) {
        student st1=new student("徐涛",21);
        student st2=new student("陈立",20);
        student st3=new student("张雨潇",21);
        student st4=new student("吴明聪",23);
        student st5=new student("刘涛",20);
        student st6=new student("刘国州",24);
        student st7=new student("刘国州",24);

        Map<student,String> map=new HashMap<>();
        map.put(st1,"绵阳");
        map.put(st2,"泸州");
        map.put(st3,"泸州");
        map.put(st4,"攀枝花");
        map.put(st5,"海南");
        map.put(st6,"广元");
        map.put(st7,"纽约");

        //键值对遍历
        for (Map.Entry<student,String> students:map.entrySet()){
            System.out.println(students.getKey()+"-------"+students.getValue());
        }
        //通过键遍历值
        Set<student> students = map.keySet();
        for (student students1:students){
            String value=map.get(students1);
            System.out.println(students1+"--------"+value);
        }
    }
}
