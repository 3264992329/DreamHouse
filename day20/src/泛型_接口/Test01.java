package 泛型_接口;

public class Test01 {
    public static void main(String[] args) {
        //方法一:
        MyArrayList<String> list=new MyArrayList<>();
        list.add("bbb");
        System.out.println(list.get(0));
        //方法二:
        MyArrayList02 list02=new MyArrayList02();
        list02.add("aaa");
        System.out.println(list02.get(0));
    }
}
