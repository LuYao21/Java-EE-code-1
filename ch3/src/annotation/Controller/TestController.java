package annotation.Controller;


import annotation.Service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//由Controller调用到Service，由Service调用到Dao，其中使用了不同的注解，不需要在.xml中生成三个bean,
//在annotation这个包中根据各种注解的名称或者类型就可以生成bean
@Controller
public class TestController {
    @Autowired//可以消除setter和getter
    private TestService testService;
    public void save(){
        testService.save();
        System.out.println("testController save");
    }
}
