package com.controller;

import com.dao.UserDao;
import com.mybatis.po.myUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller("userController")
public class UserController {
    @Autowired
    private UserDao userDao;
    public void test() {
        //查询一个用户
        myUser auser = userDao.selectUserById(11);
        System.out.println(auser);
        System.out.println("================");
        //添加一个用户
        myUser addmu = new myUser();
        addmu.setUsername("陈恒");
        addmu.setPassword("chenheng");
        addmu.setSex("男");
        addmu.setEmail("123321@ch.com");
        int add = userDao.addUser(addmu);
        System.out.println("添加了" + add + "条记录");
        System.out.println("================");
        //修改一个用户
        myUser updatemu = new myUser();
        updatemu.setId(11);
        updatemu.setUsername("张三");
        updatemu.setSex("女");
        int up = userDao.updateUser(updatemu);
        System.out.println("修改了" + up + "条记录");
        System.out.println( "================");
        //删除一个用户
        int dl = userDao.deleteUser(12);
        System.out.println("删除了" + dl + "条记录");
        System.out.println("================");
        //查询所有用户
        List< myUser> list = userDao.selectAllUser();
        for (myUser myUser : list) {
            System.out.println(myUser);
        }
    }
}
