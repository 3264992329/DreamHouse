public class 递归算法 {
    public static void main(String[] args) {
        //求和
        System.out.println(getSum(100));
        //求阶乘
        System.out.println(getCheng(99));
    }

    public static int getSum(int a) {
        if (a==1){
            return 1;
        }
        return a+getSum(a-1);
    }

    public static int getCheng(int a) {
        if (a==1){
            return 1;
        }
        return a*getCheng(a-1);
    }
}
