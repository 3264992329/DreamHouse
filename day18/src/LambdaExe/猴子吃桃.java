package LambdaExe;

public class 猴子吃桃 {
    public static void main(String[] args) {
        System.out.println(result(1));
    }

    public static int result(int day) {
        if (day<0||day>11){
            return -1;
        }
        if (day==10){
            return 1;
        }else {
            return (result(day+1)+1)*2;
        }
    }
}
