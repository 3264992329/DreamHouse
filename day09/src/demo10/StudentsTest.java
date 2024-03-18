package demo10;

public class StudentsTest {
    public static void main(String[] args) {
        Students[] arr=new Students[10];

        Students st1=new Students(1,"徐涛",21);
        Students st2=new Students(2,"刘涛",20);
        Students st3=new Students(3,"章鱼小",20);

        arr[0]=st1;
        arr[1]=st2;
        arr[2]=st3;

        int a=index(arr);
        if (a>=0){
            arr[a].setAge(arr[a].getAge()+1);
            printfArr(arr);
        }else {
            System.out.println("不存在这个人");
        }
    }

    public static int index (Students[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getId()==2){
                return i;
            }
        }
        return -1;
    }

    public static void printfArr(Students[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getId()+","+arr[i].getAge()+","+arr[i].getName());
        }
    }
}
