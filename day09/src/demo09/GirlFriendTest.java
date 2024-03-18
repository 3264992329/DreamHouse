package demo09;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriends[] arr=new GirlFriends[3];

        GirlFriends gl1=new GirlFriends("zjc",18,"女","跳舞");
        GirlFriends gl2=new GirlFriends("zyx",17,"人妖","打飞机");
        GirlFriends gl3=new GirlFriends("lt",16,"人妖","扣屁眼");

        arr[0]=gl1;
        arr[1]=gl2;
        arr[2]=gl3;

        int sum=0,count=0;
        double avg;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i].getAge();
        }
        avg=sum/arr.length;
        System.out.println("平均值为:"+avg);
        for (int i = 0; i < arr.length; i++) {
            if (avg>arr[i].getAge()){
                System.out.print(arr[i].getName()+",");
                System.out.print(arr[i].getAge()+",");
                System.out.print(arr[i].getGender()+",");
                System.out.println(arr[i].getHobby()+",");
                count++;
            }
        }
        System.out.println("一共有"+count+"个人年龄小于平均值");
    }
}
