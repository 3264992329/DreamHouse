package exe5;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class test1 {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\86187\\Desktop\\test.txt");
        BufferedReader bf=new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        ArrayList<students> list=new ArrayList<>();
        String line;
        while ((line= bf.readLine())!=null){
            String name = line.split("-")[0];
            String gender = line.split("-")[1];
            int age = Integer.parseInt(line.split("-")[2]);
            double weight = Double.parseDouble(line.split("-")[3]);
            students stu=new students(name,gender,age,weight);
            list.add(stu);
        }
        bf.close();
        //获取权重总和
        double weights=0;
        for (students students : list) {
            weights=weights+students.getWeight();
        }
        //获取每一个学生的占比
        double average;
        for (students students : list) {
            average=students.getWeight()/weights;
            students.setWeight(average);
        }
        //获取每一个学生的范围
        double[] db=new double[list.size()];
        double t=0;
        for (int i = 0; i < db.length; i++) {
            db[i]=t+list.get(i).getWeight();
            t=t+list.get(i).getWeight();
        }
        System.out.println(Arrays.toString(db));
        //随机0-1.0之间的数
        double random = Math.random();
        System.out.println(random);
        //二分查找随机数能够插入的位置
        int i = Arrays.binarySearch(db, random);
        int result=-i;
        System.out.println(result);
        //输出第result个元素
        System.out.println(list.get(result-1));
        //概率减半
        list.get(result-1).setWeight(list.get(result-1).getWeight()/2);
        //再把信息写到文件中
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
        for (students students : list) {
            bw.write(students.getName()+"-"+students.getGender()+"-"+students.getAge()+"-"+students.getWeight());
            bw.newLine();
        }
        bw.close();
    }
}
