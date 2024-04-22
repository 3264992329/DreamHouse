package 泛型_类;

import java.util.Arrays;

//当编写一个类,不确定类的类型时,可以定义这个类为泛型
public class MyArrayList<E> {
     Object[] obj=new Object[10];
     int size=0;
     //add方法
     public boolean add(E e) {
          obj[size]=e;
          size++;
          return true;
     }

     //get
     public E get(int a){return (E)obj[a];}

     //toString
     @Override
     public String toString() {
          return Arrays.toString(obj);
     }
}
