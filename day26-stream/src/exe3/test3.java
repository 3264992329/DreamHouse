package exe3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test3 {
    public static void main(String[] args) {
        ArrayList<String> manList=new ArrayList<>();
        ArrayList<String> womanList=new ArrayList<>();
        Collections.addAll(manList,"������,24","Ҷ����,23","������,22","��ǫ,24","�ܼ�,30","���Ƥ,27");
        Collections.addAll(womanList,"����ӱ,35","��ӱ,36","��ԲԲ,43","������,31","��˼,35","��С��,31");

        //ֻҪ����Ϊ�����ֵ�ǰ��������Ա
        Stream<String> limit = manList.stream().
                filter(s -> s.split(",")[0].length() == 3).
                limit(2);

        System.out.println("====================");
        //Ů��ԱֻҪ�����,�Ҳ�Ҫ��һ��
        Stream<String> yang = womanList.stream().
                filter(s -> s.split(",")[0].startsWith("��")).
                skip(1);

        System.out.println("====================");
        //���˺����Ů��Ա���ϲ���һ��,����װ��actor����(����:����,����)
        List<actor> collect = Stream.concat(limit, yang).
                map(s -> new actor(s.split(",")[0], Integer.parseInt(s.split(",")[1]))).
                collect(Collectors.toList());
        System.out.println(collect);
    }
}
