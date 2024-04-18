package LambdaExe;

import java.util.Arrays;
import java.util.Comparator;

public class Test1 {
    public static void main(String[] args) {
        //三个女朋友对象
        girls gf1=new girls("zjc",21,1.6);
        girls gf2=new girls("lt",21,1.78);
        girls gf3=new girls("zyx",22,1.7);

        girls[] gfs={gf1,gf2,gf3};
        //Lambda表达式
        Arrays.sort(gfs, (girls o1, girls o2)-> {
                double temp = o1.getAge()- o2.getAge();
                temp=temp==0?o1.getHeight()-o2.getHeight():temp;
                temp=temp==0?o1.getName().compareTo(o2.getName()):temp;

                if (temp>0){
                    return 1;
                }else if (temp<0){
                    return -1;
                }else {
                    return 0;
                }

            }
        );

        for (int i = 0; i < gfs.length; i++) {
            System.out.println(gfs[i]);
        }
    }
}
