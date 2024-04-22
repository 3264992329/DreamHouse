package 泛型_类;

public class Test1 {
    public static void main(String[] args) {
        MyArrayList<String> list=new MyArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list.get(1));
        System.out.println(list.toString());

        MyArrayList<Integer> list1=new MyArrayList<>();
        list1.add(111);
        list1.add(222);
        list1.add(333);
        System.out.println(list1.get(1));
        System.out.println(list1.toString());
    }
}
