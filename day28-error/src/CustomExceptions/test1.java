package CustomExceptions;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("����Ů������Ϣ:");

        girls gl1=new girls();

        while (true) {
            try {
                System.out.println("������Ů��������:");
                String name=sc.nextLine();
                gl1.setName(name);
                System.out.println("������Ů��������");
                String age=sc.nextLine();
                gl1.setAge(Integer.parseInt(age));
                //������Ϣȫ����ȷ,����ѭ��
                break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println(gl1);
    }
}
