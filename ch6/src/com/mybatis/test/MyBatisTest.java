package com.mybatis.test;

import com.mybatis.po.myUser;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest {
    public static void main(String[] args) {
        try{
            //读取配置文件
            InputStream config=Resources.getResourceAsStream("mybatis-config.xml");
            //根据配置文件构建SqlSessionFactory
            SqlSessionFactory ssf=new SqlSessionFactoryBuilder().build(config);
            //创建会话对象
            SqlSession ss = ssf.openSession();
            //执行映射文件中定义的SQL，并返回映射结果
            //*.selectUserById中定义了一个查询SQL语句，查询一个用户
            myUser mu = ss.selectOne("com.mybatis.mapper.UserMapper.selectUserById",1);
            System.out.println(mu);
            //添加一个用户
            myUser addmu = new myUser();
            addmu.setUsername("陈恒");
            addmu.setPassword("chenheng");
            addmu.setSex("男");
            addmu.setEmail("123321@qq.com");
            ss.insert("com.mybatis.mapper.UserMapper.addUser",addmu);
            //修改一个用户
            myUser updatemu = new myUser();
            updatemu.setId(4);
            updatemu.setUsername("张三");
            updatemu.setPassword("zhangsan");
            updatemu.setSex("男");
            ss.update("com.mybatis.mapper.UserMapper.updateUser",updatemu);
            //删除一个用户
            ss.delete("com.mybatis.mapper.UserMapper.deleteUser",3);
            //查询所有用户
            List<myUser> listMu = ss.selectList("com.mybatis.mapper.UserMapper.selectAllUser");
            for (myUser myUser : listMu) {
                System.out.println(myUser);
            }
            //提交事务
            ss.commit();
            //关闭SqlSession
            ss.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
