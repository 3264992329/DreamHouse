package 学生管理系统;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void StudentSystemControl() {
        System.out.println("--------------------");

        ArrayList<Students> list=new ArrayList<>();

        Students st1=new Students("11","xt",21,"绵阳");
        Students st2=new Students("22","zjc",21,"内江");
        Students st3=new Students("33","lt",21,"泸州");
        Students st4=new Students("44","zyx",21,"泸州");
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);

        Scanner sc=new Scanner(System.in);
        loop:while (true){

            System.out.print("输入 1 添加学生   ||");
            System.out.print("   输入 2 删除学生   ||");
            System.out.print("   输入 3 修改学生   ||");
            System.out.println("   输入 4 查询学生");

            String t= sc.next();
            switch (t){
                case "1"-> {
                    Students st5=new Students();
                    System.out.println("请输入需要添加到学生id");
                    String id= sc.next();
                    st5.setId(id);
                    System.out.println("请输入需要添加到学生姓名");
                    String name=sc.next();
                    st5.setName(name);
                    System.out.println("请输入需要添加到学生年龄");
                    int age=sc.nextInt();
                    st5.setAge(age);
                    System.out.println("请输入需要添加到学生家庭住址");
                    String home=sc.next();
                    st5.setHome(home);

                    list.add(st5);
                    System.out.println("添加成功!");
                }
                case "2"-> {
                    System.out.println("输入需要删除的学生的id号:");
                    String id=sc.next();
                    deleteStudent(id,list);
                }
                case "3"-> {
                    System.out.println("输入需要更新的学生id号:");
                    String id=sc.next();
                    System.out.println("输入需要更新的学生姓名:");
                    String name= sc.next();
                    System.out.println("输入需要更新的学生年龄:");
                    int age= sc.nextInt();
                    System.out.println("输入需要更新的学生家庭住址:");
                    String home= sc.next();
                    updateStudent(id,list,name,age,home);
                }
                case "4"-> {
                    System.out.println("输入需要查询的学生的id:");
                    String id= sc.next();
                    Students temp=queryStudent(id,list);
                    if(temp!=null){
                        System.out.println("id\t\t姓名\t\t年龄\t\t家庭住址");
                        System.out.println(temp.getId()+"\t"+"\t"+temp.getName()+"\t"+"\t"+temp.getAge()+"\t"+"\t"+temp.getHome());
                    }
                }
                case "5"-> {
                    System.out.println("退出");
                    break loop;
                }
                default -> System.out.println("不存在此选项");
            }

        }


    }

    //添加
   /* *public static ArrayList<Students> addStudent(Students st,ArrayList<Students> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(st.getId())){
                System.out.println("添加失败已存在id为:"+st.getId()+"的学生");
                return list;
            }
        }
        list.add(st);
        System.out.println("添加成功!");
        return list;
    }*/

    //删除
    public static void deleteStudent(String id,ArrayList<Students> list) {
        for (int i = 0; i < list.size(); i++) {
            Students t=list.get(i);
            if (t.getId().equals(id)){
                list.remove(i);
                System.out.println("删除成功!");
                break;
            }else if(i==list.size()-1){
                System.out.println("不存在该学生");
            }
        }
    }

    //更新
    public static void updateStudent(String id,ArrayList<Students> list,String name,int age,String home) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)){
                list.get(i).setName(name);
                list.get(i).setAge(age);
                list.get(i).setHome(home);
                System.out.println("更新成功!");
                return;
            }
        }
        System.out.println("不存在该学生");
    }

    //查询
    public static Students queryStudent(String id, ArrayList<Students> list) {
        if(list.isEmpty()){
            System.out.println("集合为空!");
            return null;
        }

        if (id.equals("all")){
            System.out.println("id\t\t姓名\t\t年龄\t\t家庭住址");
            for (int i = 0; i < list.size(); i++) {
                Students st=list.get(i);
                System.out.println(st.getId()+"\t"+"\t"+st.getName()+"\t"+"\t"+st.getAge()+"\t"+"\t"+st.getHome());
            }
            return null;
        }

        Students t=new Students();
        for (int i = 0; i < list.size(); i++) {
            t=list.get(i);
            if (t.getId().equals(id)){
                System.out.println(t);
                System.out.println("查询成功!");
                break;
            }
        }
        return t;
    }
}
