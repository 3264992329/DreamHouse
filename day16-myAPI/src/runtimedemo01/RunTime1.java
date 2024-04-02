package runtimedemo01;

import java.io.IOException;

public class RunTime1 {
    public static void main(String[] args) throws IOException {

        //获取runtime对象
        //RunTime r1=Runtime.getRuntime();

        //exit 停止虚拟机
        //Runtime.getRuntime().exit(0);

        //获取cpu线程
        System.out.println(Runtime.getRuntime().availableProcessors());

        //获取总内存大小
        System.out.println(Runtime.getRuntime().maxMemory());

        //以获取的内存大小
        System.out.println(Runtime.getRuntime().totalMemory());

        //剩余的内存大小
        System.out.println(Runtime.getRuntime().freeMemory());

        //cmd
        Runtime.getRuntime().exec("notepad");


    }
}
