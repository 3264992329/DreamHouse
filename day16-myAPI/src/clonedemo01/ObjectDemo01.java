package clonedemo01;

public class ObjectDemo01 {
    public static void main(String[] args) throws CloneNotSupportedException {
        int[] data={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        User u1=new User("徐涛大帅哥",21,data);

        User u2=  u1.clone();
        int[] arr=u1.getData();
        arr[0]=99;
        System.out.println(u1);

        System.out.println(u2);
    }
}
