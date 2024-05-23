import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {

    /*
    *
    * 方法作用:
    *        给明星的对象,创建一个代理
    * 形参:
    *        被代理的明星对象
    * 返回值:
    *        给明星创建代理
    *
    * */

    public static Star creatProxy(BIgStar bIgStar) {
        Star star = (Star) Proxy.newProxyInstance(
                ProxyUtil.class.getClassLoader(),//参数一:用于指定哪个类加载器,去加载生成的代理类
                new Class[]{Star.class},//参数二:指定接口,这些接口用于指定生成的代理长什么,也就是是有哪些方法
                new InvocationHandler() {//参数三:用于指定生成的代理对象要干什么
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        if (method.getName().equals("sing")){
                            System.out.println("准备场地,收钱");
                        }
                        if (method.getName().equals("dance")){
                            System.out.println("准备场地,收钱");
                        }
                        return method.invoke(bIgStar,args);
                    }
                }
        );
        return star;
    }
}
