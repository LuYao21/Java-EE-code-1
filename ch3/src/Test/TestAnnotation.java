package Test;

import annotation.Controller.TestController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotation {
    public  static void main(String[] args){
        ApplicationContext appCon = new ClassPathXmlApplicationContext("annotationContext.xml");
        TestController t = (TestController)appCon.getBean("testController");
        t.save();
    }
}
