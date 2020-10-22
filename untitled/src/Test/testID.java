package Test;
import Service.TestIDService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testID {
    public static void main(String[] arg){
        ApplicationContext appCon = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //从类路径下的一个或多个xml配置文件中加载上下文定义，适用于xml配置的方式。
        TestIDService tt = (TestIDService) appCon.getBean("IDService");
        //从容器中获得实例对象
        tt.sayhello();
    }
}
