package StringBuilder;

public class 打乱顺序 {
    public static void main(String[] args) {
        String str="sda54564sad";
        char[] result=str.toCharArray();
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
