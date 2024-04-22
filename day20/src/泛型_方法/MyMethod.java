package 泛型_方法;

import java.util.ArrayList;

public class MyMethod {
    private MyMethod(){}

    public static<E> void addAll(ArrayList<E> list,E...e) {
        for (E element:e){
            list.add(element);
        }
    }
}
