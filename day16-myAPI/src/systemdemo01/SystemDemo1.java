package systemdemo01;

public class SystemDemo1 {
    public static void main(String[] args) {
        //0:正常停止
        //1:异常停止

       /* System.exit(0);
        System.out.println("hahahahaha");*/

        //返回当前系统的时间毫秒值形式
        long l=System.currentTimeMillis();
        System.out.println(l);

        //拷贝数组
        int[] arr1={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
        int[] arr2=new int[36];
        //第一个数据:数据源,拷贝数据来自哪个数组
        //第二个数据:数据源数组从哪个索引开始拷贝
        //第三个数据:目的数组
        //第四个数据:复制到目的数组的第几个索引开始
        //第五个数据:一共复制多少个数据
        System.arraycopy(arr1,1,arr2,1,15);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+",");
        }

    }
}
