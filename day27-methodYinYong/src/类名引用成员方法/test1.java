package �������ó�Ա����;

import java.util.Arrays;

public class test1 {
    public static void main(String[] args) {
        String[] arr={"aaa","bbb","ccc","ddd"};
        Arrays.stream(arr).map(String::toUpperCase).forEach(s -> System.out.println(s));
    }
}
