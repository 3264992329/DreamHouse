package execise;

import java.util.ArrayList;
import java.util.Collections;

public class exe1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"����","֣����","����","����","������","������","������");
        Collections.shuffle(list);
        System.out.println(list.get(0));
    }
}
