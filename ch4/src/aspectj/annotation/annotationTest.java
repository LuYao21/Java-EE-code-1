package aspectj.annotation;

import dynamic.jdk.TestDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class annotationTest {
    public static void main(String[] args) {
        ApplicationContext appCon = new ClassPathXmlApplicationContext("/aspectj/annotation/applicationContext.xml");
        TestDao testDaoB=(TestDao)appCon.getBean("testDao");
        testDaoB.save();
    }

}
