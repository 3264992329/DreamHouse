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
            System.out.println("����Խ��");
        }catch (ArithmeticException d){
            System.out.println("��ĸ����Ϊ��");
        } catch (NullPointerException d){
            System.out.println("��ָ���쳣");
        }catch (Exception d){
            System.out.println("�쳣");
        }

        System.out.println("look me ��������");
    }
}
