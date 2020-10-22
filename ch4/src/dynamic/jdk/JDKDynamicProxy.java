package dynamic.jdk;

import aspect.MyAspect;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKDynamicProxy implements InvocationHandler {
    //创建一个TestDao类
    private TestDao testDao;
    //创建代理方法，建立代理对象和真实对象的代理关系，并返回对象
    public Object createProxy(TestDao testDao){
        this.testDao=testDao;
        //类加载器cld
        ClassLoader cld = JDKDynamicProxy.class.getClassLoader();
        //实现被代理对象的所有接口
        Class[] clazz = testDao.getClass().getInterfaces();
        //使用代理类进行增强，返回代理后的对象
        return Proxy.newProxyInstance(cld,clazz,this);
    }
    /*
    *代理的逻辑方法，所有动态代理类的方法调用都交给该方法处理
    * proxy是被代理对象
    * method是代理方法
    * args是执行方法时需要的参数
    * return是代理返回的结果
     */
    public Object invoke(Object proxy, Method method,Object[] args) throws Throwable {
        MyAspect myAspect = new MyAspect();
        myAspect.check();
        myAspect.except();
        Object obj = method.invoke(testDao,args);
        myAspect.log();
        myAspect.monitor();
        return obj;
    }
}
