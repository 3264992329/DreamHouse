package demo01;

public class method {
    public static void main(String[] args) {
        int[] arr=new int[3];

        arr[0]=1;
        arr[1]=2;
        arr[2]=3;

        System.out.println(str(arr));
    }

    public static String str(int[] arr) {

        if (arr==null){
            return "";
        }
        if (arr.length==0){
            return "[]";
        }

        String t="[";
        for (int i = 0; i < arr.length; i++) {
            t=t+arr[i];
            if(i< arr.length-1){
                t=t+",";
            }
        }

        t=t+"]";
        return t;
    }
}
