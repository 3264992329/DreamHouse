package 泛型_案例1;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<poshi> list=new ArrayList<>();
        poshi p1=new poshi();
        keepCat(list,p1);

        ArrayList<husky> list1=new ArrayList<>();
        husky h1=new husky();
        keepDog(list1,h1);

        ArrayList<cat> list2=new ArrayList<>();
    }

    public static<E> void keepAnimal(ArrayList<? extends animal> list,E...e) {
        list.add(e);
    }
    public static<E> void keepCat(ArrayList<? extends cat> list,E...e) {
        list.add(e);
    }
    public static<E> void keepDog(ArrayList<? extends dog> list,E...e) {
        list.add(e);
    }
}
