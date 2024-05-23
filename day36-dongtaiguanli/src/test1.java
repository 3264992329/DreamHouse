public class test1 {
    public static void main(String[] args) {
        //创建对象
        BIgStar star = new BIgStar("鸡哥");
        Star creatProxy = ProxyUtil.creatProxy(star);

        String s = creatProxy.sing("只因你太美");
        System.out.println(s);

        creatProxy.dance();
    }
}
