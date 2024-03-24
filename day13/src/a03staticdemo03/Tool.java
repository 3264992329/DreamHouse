package a03staticdemo03;

import java.util.ArrayList;

public class Tool {

    //私有化构造方法,不让外界创建他的对象
    private Tool(){};
    public static int getMaxAge(ArrayList<Student> list){
        int maxage=0;
        for (int i = 0; i < list.size(); i++) {
            if (maxage<list.get(i).getAge()){
                maxage=list.get(i).getAge();
            }
        }
        return maxage;
    }
}
