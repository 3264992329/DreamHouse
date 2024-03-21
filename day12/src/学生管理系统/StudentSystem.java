package 学生管理系统;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        System.out.println("--------------------");

        System.out.println("输入 1 添加学生");
        System.out.println("输入 2 删除学生");
        System.out.println("输入 3 修改学生");
        System.out.println("输入 4 查询学生");

        Scanner sc=new Scanner(System.in);
        loop:while (true){
            String t= sc.next();
            switch (t){
                case "1"-> addStudent();
                case "2"-> deleteStudent();
                case "3"-> updateStudent();
                case "4"-> queryStudent();
                case "5"-> {
                    System.out.println("退出");
                    break loop;
                }
                default -> System.out.println("不存在此选项");
            }

        }


    }

    public static ArrayList<Students> addStudent(Students st,ArrayList<Students> list) {
        list.add(st);
        System.out.println("添加");
        return list;
    }
    public static void deleteStudent() {
        System.out.println("删除");
    }
    public static void updateStudent() {
        System.out.println("更新");
    }
    public static void queryStudent() {
        System.out.println("查询");
    }
}
