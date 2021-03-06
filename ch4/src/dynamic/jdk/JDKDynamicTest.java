package dynamic.jdk;

public class JDKDynamicTest {
    public static void main(String[] args) {
        JDKDynamicProxy jdkProxy = new JDKDynamicProxy();//代理对象
        TestDao testDao = new TestDaoImpl();//目标对象
        //从代理对象中获取增强的目标对象，该对象是一个被代理的对象，它会进入代理的逻辑方法invoke中
        TestDao testDaoAdvice = (TestDao)jdkProxy.createProxy(testDao);
        testDaoAdvice.save();
        System.out.println("===============");
        testDaoAdvice.modify();;
        System.out.println("===============");
        testDaoAdvice.delete();
    }


}
