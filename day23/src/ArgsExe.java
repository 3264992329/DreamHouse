public class ArgsExe {
    //һ���β��б���ֻ����һ���ɱ����args
    public static void main(String[] args) {
        System.out.println(getSum(1, 2, 3, 5, 4, 58, 77, 64, 4));
    }

    public static int getSum(int... args) {
        int sum=0;
        for (int a:args){
            sum+=a;
        }
        return sum;
    }
}
