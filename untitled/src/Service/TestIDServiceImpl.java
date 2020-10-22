package Service;

import Dao.TestIDDao;
import Dao.TestIDDaoImpl;

public class TestIDServiceImpl implements TestIDService {

    private TestIDDao testIDDao;

    public void setTestIDDao(TestIDDao testIDDao){
        this.testIDDao = testIDDao;
    }
    @Override
    public void sayhello() {
        testIDDao.sayhello();
        System.out.println("TestIDService构造注入方法");
    }
}
