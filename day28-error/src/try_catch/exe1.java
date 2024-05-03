package try_catch;

public class exe1 {
    public static void main(String[] args) {
        String[] s={"1","2","a","b"};

        try {
            System.out.println(s[1]);
            System.out.println(2/1);
            String b=null;
            System.out.println(b.equals("abc"));
        }catch (ArrayIndexOutOfBoundsException d){
            System.out.println("数组越界");
        }catch (ArithmeticException d){
            System.out.println("分母不能为零");
        } catch (NullPointerException d){
            System.out.println("空指针异常");
        }catch (Exception d){
            System.out.println("异常");
        }

        System.out.println("look me 哈哈哈哈");
    }
}
