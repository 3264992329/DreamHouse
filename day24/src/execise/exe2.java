package execise;

import java.util.ArrayList;
import java.util.Collections;

public class exe2 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list,1,1,1,1,1,1,1);
        Collections.addAll(list,0,0,0);
        Collections.shuffle(list);
        int i=list.get(0);

        ArrayList<String> boys=new ArrayList<>();
        Collections.addAll(boys,"–ÏÃŒ","¡ıÃŒ","’≈”Í‰Ï","≥¬¡¢");
        ArrayList<String> girls=new ArrayList<>();
        Collections.addAll(girls,"÷£º™¥‰","–Ï”¢÷•");

        if (i==1){
            Collections.shuffle(boys);
            System.out.println(boys.get(0));
        }else {
            Collections.shuffle(girls);
            System.out.println(girls.get(0));
        }
    }
}
