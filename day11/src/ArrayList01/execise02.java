package ArrayList01;

import java.util.ArrayList;

public class execise02 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        list.add(123);
        list.add(456);
        list.add(789);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}
