package dynamic.cglib;

import aspect.MyAspect;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibDynamicProxy implements MethodInterceptor {
    /*
    *创建代理的方法
    *target是目标对象
    *返回的是目标对象的Cglib代理对象
     */
    public Object createProxy(Object target){
        Enhancer enhancer = new Enhancer();//一个增强类对象
        enhancer.setSuperclass(target.getClass());//确定其增强的类，确定其父类
        enhancer.setCallback(this);
        return enhancer.create();
    }
/*
*intercept类在程序执行时会被调用
* proxy是cglib根据指定父类生成的代理对象
 */
    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        MyAspect myAspect = new MyAspect();
        myAspect.check();
        myAspect.except();
        Object obj = methodProxy.invokeSuper(proxy,args);
        myAspect.log();
        myAspect.monitor();
        return obj;

    }
}
