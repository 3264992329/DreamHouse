package LambdaExe;

public class 爬楼梯 {
    public static void main(String[] args) {
        System.out.println(result(20));
    }
    public static int result(int num){
        if (num==1){
            return 1;
        }
        if (num==2){
            return 2;
        }
        if (num==3){
            return 4;
        }
        return result(num-1)+result(num-2)+result(num-3);
    }
}
