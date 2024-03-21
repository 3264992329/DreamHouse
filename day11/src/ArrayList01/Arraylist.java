package ArrayList01;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList();

        //添加
        boolean result1=list.add("aaa");
        boolean result2=list.add("bbb");

       // boolean result3=list.remove("aaa");
        //boolean result4=list.remove("aaa");

        //删除
        String result5=list.remove(1);

        //修改
        list.set(0,"ccc");

        //查询
        String result6=list.get(0);
        System.out.println(result6);

        //获取集合大小
        int a=list.size();
        System.out.println("集合大小为:"+a);

        System.out.println(result1);
        System.out.println(list);

    }
}
