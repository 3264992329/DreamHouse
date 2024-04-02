package mathdemo01;

public class MathDemo1 {
    public static void main(String[] args) {
        int a=Math.abs(-1564);
        System.out.println(Math.pow(3,9));//3的9次方
        System.out.println(Math.sqrt(99));//平方根
        System.out.println(Math.cbrt(54));//立方根

        //判断一个数是否为质数
        System.out.println(isPrime(997));

        //自幂数,求水仙花数
        System.out.println("水仙花数为"+WaterFlower());
    }

    private static int WaterFlower() {
        int a=0;
        for (int i = 10; i < 99; i++) {
            int g=i%10;
            int s=i/10%10;

            double t=Math.pow(g,2)+Math.pow(s,2);
            if (t==i){
                System.out.println(i);
                a++;
            }
        }
        return a;
    }

    private static boolean isPrime(int a) {
        int sum=0;
        for (int i = 2; i < Math.sqrt(a); i++) {
            sum++;
            if (a/i==0){
                return false;
            }
        }
        System.out.println(sum);
        return true;
    }
}
