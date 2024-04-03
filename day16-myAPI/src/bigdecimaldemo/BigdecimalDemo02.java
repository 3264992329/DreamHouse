package bigdecimaldemo;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigdecimalDemo02 {
    public static void main(String[] args) {
        BigDecimal bigDecimal=new BigDecimal("10");
        BigDecimal bigDecimal1=new BigDecimal("3.0");

        BigDecimal bigDecimal2=bigDecimal.add(bigDecimal1);
        System.out.println(bigDecimal2);

        BigDecimal bigDecimal3=bigDecimal.divide(bigDecimal1,3,2);
        System.out.println(bigDecimal3);

        BigDecimal bigDecimal4=bigDecimal.multiply(bigDecimal1);
        System.out.println(bigDecimal4);

        BigDecimal bigDecimal5=bigDecimal.subtract(bigDecimal1);
        System.out.println(bigDecimal5);
    }
}
