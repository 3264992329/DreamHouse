package MyZipStream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo3 {
    public static void main(String[] args) throws IOException {
        File src=new File("C:\\Users\\86187\\Desktop\\abc123");
        File dest=src.getParentFile(); //C:\Users\86187\Desktop\
        ZipOutputStream zos=new ZipOutputStream(new FileOutputStream(new File(dest,src.getName()+".Zip")));
        toZip(src,zos,src.getName());
    }
    public static void toZip(File src,ZipOutputStream zos,String name) throws IOException {
        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isFile()){
                //���ļ���д��
                //��д���ļ����
                ZipEntry entry=new ZipEntry(name+"\\"+file.getName());
                zos.putNextEntry(entry);
                //��д���ļ�����
                FileInputStream fis=new FileInputStream(file);
                int b;
                byte[] bytes=new byte[1024];
                while ((b=fis.read(bytes))!=-1){
                    zos.write(bytes,0,b);
                }
                fis.close();
                zos.closeEntry();
            }else {
                //���ļ��о͵ݹ�
                toZip(file,zos,name+"\\"+file.getName());
            }
        }
        //�ر�
        zos.close();
    }
}
