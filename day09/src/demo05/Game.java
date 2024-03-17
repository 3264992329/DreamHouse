package demo05;

import java.util.Random;

public class Game {
    private String name;
    private int blood;

    public Game() {
    }

    public Game(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }


    public void Fight(Game role) {
        Random rd = new Random();
        int hurt = rd.nextInt(100);
        role.blood = role.blood - hurt;
        role.blood=(role.blood>=0)?role.blood:0;
        System.out.println(this.name + "攻击了" + role.name + ",造成" + hurt + "点伤害," + role.name + "还剩" + role.blood + "点血");
    }
}
