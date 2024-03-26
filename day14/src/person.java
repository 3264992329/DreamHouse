public class person{
    private String name;
    private int age;

    public person() {
    }

    public person(String name, int age) {
        this.name = name;
        this.age = age;
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
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "person{name = " + name + ", age = " + age + "}";
    }

    /*public void keepPet(Dog dog,String something){
        System.out.println(age+"岁的"+name+"喂养了"+dog.getAge()+
                "岁的"+dog.getColor()+"色的宠物狗吃"+something);

        dog.eat(something);
    }

    public void keepPet(Cat cat,String something){
        System.out.println(age+"岁的"+name+"喂养了"+cat.getAge()+
                "岁的"+cat.getColor()+"色的宠物猫吃"+something);

        cat.eat(something);*/

    public void keepPet(Animal a,String something){
        if(a instanceof Dog d){
            System.out.println(age+"岁的"+name+"喂养了"+d.getAge()+
                    "岁的"+d.getColor()+"色的宠物狗豆豆娃吃"+something);

            d.eat(something);
        }else if (a instanceof Cat c){
            System.out.println(age+"岁的"+name+"喂养了"+c.getAge()+
                    "岁的"+c.getColor()+"色的宠物猫咪吃"+something);

            c.eat(something);
        }else {
            System.out.println("不存在这种宠物!");
        }

    }
}
