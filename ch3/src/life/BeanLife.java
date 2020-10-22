package life;

public class BeanLife {
    public void initmyself(){
        System.out.println(this.getClass().getName()+"执行自定义初始化方法");
    }
    public void destroryMyself(){
        System.out.println(this.getClass().getName()+"执行自定义销毁化方法");
    }
}
