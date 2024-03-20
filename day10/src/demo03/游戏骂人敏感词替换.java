package demo03;

import java.util.Scanner;

public class 游戏骂人敏感词替换 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("和队友交流交流:");

        String talk= sc.next();
        String[] swear={"CNM","TMD","WOC","WOR","SB"};

        for (int i = 0; i < swear.length; i++) {
            talk=talk.replace(swear[i],"******");
        }

        System.out.println(talk);
    }
}
