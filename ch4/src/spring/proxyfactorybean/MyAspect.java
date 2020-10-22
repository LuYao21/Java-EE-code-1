package spring.proxyfactorybean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation arg0) throws Throwable {
        check();
        except();
        Object obj = arg0.proceed();
        log();
        monitor();
        return obj;
    }

    private void monitor() {
        System.out.println("模拟权限控制");
    }

    private void log() {
        System.out.println("模拟异常处理");
    }

    private void except() {
        System.out.println("模拟日志记录");
    }

    private void check() {
        System.out.println("性能监测");
    }
}
