package Test;

import Instance.BeanClass;
import annotation.AnnotationUser;
import assemble.ComplexUser;
import life.BeanLife;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
     public static void main(String[] args) {
/*
         ApplicationContext appCon = new ClassPathXmlApplicationContext("ApplicationContext.xml");

         BeanClass aa = (BeanClass)appCon.getBean("constructorIntance");
         System.out.println(aa+aa.message);

         BeanClass bb = (BeanClass)appCon.getBean("staticFactoryInstance");
         System.out.println(bb+bb.message);

         BeanClass cc = (BeanClass)appCon.getBean("instancefactoryinstance");
         System.out.println(cc+cc.message);

         ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
         System.out.println("获得对象前");
         BeanLife blife = (BeanLife)ctx.getBean("beanlife");
         System.out.println("获得对象后"+blife);
         ctx.close();
*/
        /*测试两个user
         ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("ApplicationContext.xml");
         ComplexUser u1 = (ComplexUser)app.getBean("user1");
         System.out.println(u1);
         ComplexUser u2 = (ComplexUser)app.getBean("user2");
         System.out.println(u2);
         8*/
         //注解@Component测试
         ApplicationContext appCon = new ClassPathXmlApplicationContext("annotationContext.xml");
         AnnotationUser u = (AnnotationUser)appCon.getBean("annotationUser");
         System.out.println(u.getUname());
    }
}
