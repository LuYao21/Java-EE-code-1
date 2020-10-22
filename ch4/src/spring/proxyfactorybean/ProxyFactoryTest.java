package spring.proxyfactorybean;


import dynamic.jdk.TestDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProxyFactoryTest {
    public static void main(String[] args) {
        ApplicationContext appCon = new ClassPathXmlApplicationContext("/spring/proxyfactorybean/applicationContext.xml");
        TestDao testDaoAdvice = (TestDao)appCon.getBean("testDaoProxy");
        testDaoAdvice.save();
        System.out.println("===============");
        testDaoAdvice.modify();
        System.out.println("===============");
        testDaoAdvice.delete();
    }
}
