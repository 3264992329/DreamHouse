package Demo1;

public class 逢7过 {
    public static void main(String[] args) {
        int num=100;
        for (int i=1;i<=100;i++){
            if (i%10==7||i/10%10==7||i%7==0){
                System.out.println("过");
            }
            else {
                System.out.println(i);
            }
        }


    }
}
