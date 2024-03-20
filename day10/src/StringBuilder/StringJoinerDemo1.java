package StringBuilder;
import java.util.StringJoiner;
public class StringJoinerDemo1 {
    public static void main(String[] args) {
        StringJoiner sj=new StringJoiner(",","[","]");
        sj.add("1234").add("5678").add("9012").toString();
        System.out.println(sj);

        int len= sj.length();
        System.out.println(len);
    }
}
