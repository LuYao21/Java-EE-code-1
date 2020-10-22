package aspect.xml;

import dynamic.jdk.TestDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLAspectJTest {
    public static void main(String[] args) {
        ApplicationContext appCon = new ClassPathXmlApplicationContext("/aspect/xml/applicat.xml");

        TestDao testDaoA =(TestDao)appCon.getBean("testDao");

        testDaoA.save();
    }
}
