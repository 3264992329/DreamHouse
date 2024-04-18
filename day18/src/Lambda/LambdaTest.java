package Lambda;

public class LambdaTest {
    public static void main(String[] args) {
       /* method(new swim() {
            @Override
            public void swimming() {
                System.out.println("ing123456");
            }
        });  */

        /*
        Lambda表达式格式
        ()->{

        }
        */
        method(()-> {
                System.out.println("ing123456");
            }
        );
    }

    public static void method(swim s) {
        s.swimming();
    }
}
