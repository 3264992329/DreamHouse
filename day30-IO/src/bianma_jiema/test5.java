package bianma_jiema;

import java.io.*;

public class test5 {
    public static void main(String[] args) throws IOException {
        //拷贝一个文件夹
        File come=new File("C:\\Users\\86187\\Desktop\\我们");
        File go=new File("C:\\Users\\86187\\Desktop\\go");
        copyFile(come,go);
    }

    public static void copyFile(File come,File go) throws IOException {
        File[] files = come.listFiles();
        go.mkdirs();
        for (File file : files) {
            if (file.isFile()){
                FileInputStream fis=new FileInputStream(file);
                FileOutputStream fos=new FileOutputStream(new File(go,file.getName()));
                byte[] bytes=new byte[1024*1024*5];
                int b;
                while ((b=fis.read(bytes))!=-1){
                    fos.write(bytes,0,b);
                }
            }else {
                copyFile(file,new File(go,file.getName()));
            }
        }
    }
}
