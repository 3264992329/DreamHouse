package demo06;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private String face;
    private char gender;

    String[] boyfaces = {"帅气逼人", "英俊潇洒", "风流倜傥", "面目狰狞"};
    String[] girlfaces = {"美丽动人", "前凸后翘", "惨目忍睹", "亭亭玉立"};

    //attack 攻击描述：
    String[] attacks_desc = {
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };

    //injured 受伤描述：
    String[] injureds_desc = {
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };

    public Role() {
    }

    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     *
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }

    /**
     * 获取
     *
     * @return face
     */
    public String getFace() {
        return face;
    }

    /**
     * 设置
     *
     * @param gender
     */
    public void setFace(char gender) {
        Random rd = new Random();
        int t = rd.nextInt(4);
        if (this.gender == '女') {
            this.face = girlfaces[t];
        } else {
            this.face = boyfaces[t];
        }
        this.face = face;
    }

    /**
     * 获取
     *
     * @return gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * 设置
     *
     * @param gender
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    public void Fight(Role role) {
        Random rd1 = new Random();
        int a = rd1.nextInt(6);
        int b = rd1.nextInt(8);

        String KungFu = attacks_desc[a];
        String con = injureds_desc[b];

        System.out.printf(KungFu, this.getName(), role.getName());

        System.out.println();

        Random rd = new Random();
        int hurt = rd.nextInt(50);
        role.blood = role.blood - hurt;
        role.blood = (role.blood >= 0) ? role.blood : 0;
        System.out.println(this.face + "的" + this.name
                + "攻击了" + role.face + "的"
                + role.name + ",造成" + hurt
                + "点伤害," + role.name + "还剩"
                + role.blood + "点血");

        if (role.blood > 90) {
            System.out.printf(injureds_desc[0], role.name);
        } else if (role.blood > 80 && role.blood <= 90) {
            System.out.printf(injureds_desc[1], role.name);
        } else if (80 > role.blood && role.blood >= 70) {
            System.out.printf(injureds_desc[2], role.name);
        } else if (70 > role.blood && role.blood >= 60) {
            System.out.printf(injureds_desc[3], role.name);
        } else if (60 > role.blood && role.blood >= 40) {
            System.out.printf(injureds_desc[4], role.name);
        } else if (40 > role.blood && role.blood >= 20) {
            System.out.printf(injureds_desc[4], role.name);
        } else if (10 < role.blood && role.blood < 20) {
            System.out.printf(injureds_desc[4], role.name);
        } else {
            System.out.printf(injureds_desc[4], role.name);
        }

        System.out.println();
    }

    public void showRoleInfo() {
        System.out.println("姓名:" + getName());
        System.out.println("性别:" + getGender());
        System.out.println("长相:" + getFace());
        System.out.println("血量:" + getBlood());
    }
}