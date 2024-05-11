package MyZipStream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo2 {
    public static void main(String[] args) throws IOException {
        File src=new File("C:\\Users\\86187\\Desktop\\abc123.txt");
        File dest=new File("C:\\Users\\86187\\Desktop\\");
        unzip(src,dest);
    }

    public static void unzip(File src,File dest) throws IOException {
        ZipOutputStream zos=new ZipOutputStream(new FileOutputStream(new File(dest,"abc123.zip")));
        ZipEntry entry=new ZipEntry("abc123.txt");
        zos.putNextEntry(entry);
        FileInputStream fis=new FileInputStream(src);
        byte[] bytes=new byte[1024];
        int b;
        while ((b=fis.read(bytes))!=-1){
            zos.write(bytes,0,b);
        }
        zos.closeEntry();
        fis.close();
        zos.close();
    }
}
