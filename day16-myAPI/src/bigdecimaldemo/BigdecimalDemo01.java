package bigdecimaldemo;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigdecimalDemo01 {
    public static void main(String[] args) {
        BigDecimal bigDecimal=new BigDecimal(0.01);
        BigDecimal bigDecimal1=new BigDecimal(0.09);

        //通过传递double类型的小数来创建对象
        //这种方式可能不精确
        System.out.println(bigDecimal);
        System.out.println(bigDecimal1);

        //建议使用,通过传递字符串表示小数
        BigDecimal bigDecimal2=new BigDecimal("0.01");
        BigDecimal bigDecimal3=new BigDecimal("0.09");
        System.out.println(bigDecimal2);
        System.out.println(bigDecimal3);

        //通过静态方法获取
        BigDecimal bigDecimal4=BigDecimal.valueOf(10);
        BigDecimal bigDecimal5=BigDecimal.valueOf(10);
        System.out.println(bigDecimal5);
        System.out.println(bigDecimal4);
    }
}
