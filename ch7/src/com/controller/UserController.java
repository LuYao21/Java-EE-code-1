package com.controller;

import com.dao.UserDao;
import com.po.MyUser;
import com.pojo.SeletUserParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;


@Controller("userController")
public class UserController {
    @Autowired
    private UserDao userDao;
    public void test() {
        //查询一个用户
        MyUser auser = userDao.selectUserById(1);
        System.out.println(auser);
        System.out.println("================");
        //添加一个用户
        MyUser addmu = new MyUser();
        addmu.setUsername("陈恒");
        addmu.setPassword("chenheng");
        addmu.setSex("男");
        addmu.setEmail("123321@ch.com");
        int add = userDao.addUser(addmu);
        System.out.println("添加了" + add + "条记录");
        System.out.println("================");
        //修改一个用户
        MyUser updatemu = new MyUser();
        updatemu.setId(6);
        updatemu.setUsername("张三");
        updatemu.setSex("女");
        int up = userDao.updateUser(updatemu);
        System.out.println("修改了" + up + "条记录");
        System.out.println( "================");
        //删除一个用户
        int dl = userDao.deleteUser(5);
        System.out.println("删除了" + dl + "条记录");
        System.out.println("================");
        //查询所有用户
       SeletUserParam su = new SeletUserParam();
        su.setU_name("陈");
        su.setU_sex("男");
        //注意SeletUserParam是否会有影响之后的运行！！！！
        List<MyUser> list = userDao.selectAllUser(su);
        for (MyUser myUser : list) {
            System.out.println(myUser);
        }
    }
}
