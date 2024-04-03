package bigintegerdemo;

import java.math.BigInteger;

public class BigintegerDemo02 {
    public static void main(String[] args) {
        BigInteger bigInteger1=BigInteger.valueOf(18);
        BigInteger bigInteger2=BigInteger.valueOf(6);

        //加
        BigInteger bigInteger=bigInteger1.add(bigInteger2);
        System.out.println(bigInteger);

        //除
        BigInteger[] bigIntegers = bigInteger1.divideAndRemainder(bigInteger2);
        System.out.println(bigIntegers.length);
        System.out.println(bigIntegers[0]);
        System.out.println(bigIntegers[1]);

        //比较是否相等
        boolean result=bigInteger1.equals(bigInteger2);
        System.out.println(result);

        //次幂
        BigInteger bigInteger3=bigInteger1.pow(3);
        System.out.println(bigInteger3);

        //max
        BigInteger bigInteger4=bigInteger1.max(bigInteger2);
        System.out.println(bigInteger4);

        //转为int类型整数,超出范围有误
        BigInteger bigInteger5=BigInteger.valueOf(1991L);
        int temp=bigInteger5.intValue();
        System.out.println(temp);

        //转为long类型
        BigInteger bigInteger6=BigInteger.valueOf(220);
        double a=bigInteger6.doubleValue();
        System.out.println(a);
        //减
    }
}
