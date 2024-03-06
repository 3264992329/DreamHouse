package demo1;

public class ArithmeticOperatorDome1 {
    public static void main(String[] args) {
        int x=12;
        int t=x;
        int num=0;
        while (x!=0) {
            int ge=x%10;
            x=x/10;
            num=num*10+ge;
            System.out.println("num"+num);
            System.out.println(t==num);
        }

    }
}
