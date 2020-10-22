package Instance;

public class BeanStaticFactory {
    private static BeanClass beaninstance = new BeanClass("调用静态工厂方法实例化bean");
    public static BeanClass createInstance(){
        return beaninstance;
    }
}
