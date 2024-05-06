package demo2;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class exe6 {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\86187\\Desktop\\����");
        System.out.println(getNumber(file));
    }

    public static HashMap<String,Integer> getNumber(File file) {
        HashMap<String,Integer> hm=new HashMap<>();
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()){
                String[] split = file1.getName().split("\\.");
                int length = split.length;
                //���ȴ���2����ͳ��
                if (length>=2){
                    if (hm.containsKey(split[length-1])){
                        Integer i = hm.get(split[length - 1]);
                        i++;
                        hm.put(split[length-1],i);
                    }else {
                        hm.put(split[length-1],1);
                    }
                }
                //���ļ��о͵ݹ�
            }else {
                HashMap<String,Integer> hm2= getNumber(file1);
                for (Map.Entry<String, Integer> entry : hm2.entrySet()) {
                    String key = entry.getKey();
                    Integer value = entry.getValue();
                    if (hm.containsKey(key)){
                        Integer i = hm.get(key);
                        i=i+value;
                        hm.put(key,i);
                    }else {
                        hm.put(key,value);
                    }
                }
            }
        }
        return hm;
    }
}
