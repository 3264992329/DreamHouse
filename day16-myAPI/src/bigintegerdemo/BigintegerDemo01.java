package bigintegerdemo;

import java.math.BigInteger;
import java.util.Random;

public class BigintegerDemo01 {
    public static void main(String[] args) {

        //获取随机大整数,范围为:([0-2]的num次方)-1
        Random rd=new Random();
        BigInteger bigInteger=new BigInteger(4,rd);
        System.out.println(bigInteger);

        BigInteger bigInteger1=new BigInteger("9999999999999999999");
        System.out.println(bigInteger1);

        //val用 radix进制表示的值为:
        //如果该数不符合该进制的表达,会报错
        BigInteger bigInteger2=new BigInteger("888",9);
        System.out.println(bigInteger2);

        //该方法获取的值不能超过long的范围
        BigInteger bigInteger3=BigInteger.valueOf(1098790);
        System.out.println(bigInteger3);

    }
}
