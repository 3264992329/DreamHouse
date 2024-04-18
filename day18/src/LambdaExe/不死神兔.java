package LambdaExe;

public class 不死神兔 {
    static int[] a=new int[12];
    public static void main(String[] args) {
        System.out.println(result(12));
    }

    public static int result(int month) {
        if (month==1||month==2){
            return 1;
        }
        if (month>=2){
            return result(month-1)+result(month-2);
        }
        return 0;
    }

}
