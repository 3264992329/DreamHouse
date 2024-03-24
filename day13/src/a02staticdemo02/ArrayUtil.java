package a02staticdemo02;

import java.util.StringJoiner;

public class ArrayUtil {
    private ArrayUtil(){}

    public static String printArr(int[] a){
        StringBuilder sj= new StringBuilder();
        sj.append("[");
        for (int i = 0; i < a.length; i++) {
            if (i<=a.length-2){
                sj.append(a[i]).append(",");
            }else {
                sj.append(a[i]);
            }
        }
        sj.append("]");
        return sj.toString();
    }

    public static double getAerage(int[] a) {
        double sum=0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        double aerage=sum/a.length;
        return aerage;
    }
}
