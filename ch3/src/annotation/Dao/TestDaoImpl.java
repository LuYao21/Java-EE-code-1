package annotation.Dao;

import org.springframework.stereotype.Repository;

@Repository("testDao")//注解Dao层，在service层使用不能省略“”中的内容
public class TestDaoImpl implements TestDao {
    @Override
    public void save() {
        System.out.println("testDao save");
    }
}
