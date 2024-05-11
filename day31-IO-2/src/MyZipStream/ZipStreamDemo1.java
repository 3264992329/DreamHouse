package MyZipStream;

import java.io.*;
import java.nio.charset.Charset;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipStreamDemo1 {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\86187\\Desktop\\123.zip");
        File file1=new File("C:\\Users\\86187\\Desktop\\");
        unzip(file,file1);
    }

    public static void unzip(File src,File dest) throws IOException {
        ZipInputStream zip=new ZipInputStream(new FileInputStream(src), Charset.defaultCharset());
        ZipEntry entry;
        while ((entry=zip.getNextEntry())!=null){
            System.out.println(entry);
            if (entry.isDirectory()){
                //是文件夹就新建相同的文件夹
                File file=new File(dest,entry.toString());
                file.mkdirs();
            }else {
                //是文件就拷贝
                FileOutputStream fos=new FileOutputStream(new File(dest,entry.toString()));
                byte[] bytes=new byte[1024];
                int length;
                while ((length=zip.read(bytes))!=-1){
                    fos.write(bytes,0,length);
                }
                fos.close();
                //表示压缩包中的一个文件处理完毕
                zip.closeEntry();
            }
        }
        zip.close();
    }
}
