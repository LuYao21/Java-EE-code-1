package annotation.Service;

import annotation.Dao.TestDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("testService")
public class TestServiceImpl implements TestService {
    @Resource(name="testDao")//按照name来装配Bean
    private TestDao testDao;
    @Override
    public void save() {
        testDao.save();
        System.out.println("testService save");
    }
}
