package dynamic.cglib;

public class CglibDynamicTest {
    public static void main(String[] args) {
    CglibDynamicProxy cdp = new CglibDynamicProxy();
    TestDao testDao = new TestDao();
    TestDao testDao1 = (TestDao)cdp.createProxy(testDao);
    testDao1.save();
    System.out.println("===============");
    testDao1.modify();
    System.out.println("===============");
    testDao1.delete();
    }
}
