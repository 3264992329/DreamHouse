package MyZipInputStream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipStreamDemo1 {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\86187\\Desktop\\123.zip");
        File file1=new File("C:\\Users\\86187\\Desktop\\n123");
        unzip(file,file1);

    }

    public static void unzip(File src,File dest) throws IOException {
        ZipInputStream zip=new ZipInputStream(new FileInputStream(src));
        ZipEntry entry;
        while ((entry=zip.getNextEntry())!=null){
            if (entry.isDirectory()){
                //���ļ��о��½���ͬ���ļ���
                File file=new File(dest,entry.toString());
                file.mkdirs();
            }else {
                //���ļ��Ϳ���
                FileOutputStream fos=new FileOutputStream(new File(dest,entry.toString()));
                int b;
                while ((b=zip.read())!=-1){
                    fos.write(b);
                }
                fos.close();
                //��ʾѹ�����е�һ���ļ��������
                zip.closeEntry();
            }
        }
        zip.close();
    }
}
