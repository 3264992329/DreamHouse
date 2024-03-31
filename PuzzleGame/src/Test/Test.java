package Test;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random rd=new Random();
        int[][] number=new int[4][4];
        int[] a={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};

        for (int i = 0; i < 16; i++) {
            int t= rd.nextInt(16);

            int temp=a[i];
            a[i]=a[t];
            a[t]=temp;
        }

        for (int i = 0; i < 16; i++) {
            number[i/4][i%4]=a[i];
        }

    }
}
