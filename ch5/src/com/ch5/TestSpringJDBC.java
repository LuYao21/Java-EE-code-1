package com.ch5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSpringJDBC {
    public static void main(String[] args) {
        ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestDao td = (TestDao) appCon.getBean("testDao");
        String insertSql="insert into user values(null,?,?,?)";

        Object param1[]={"chenheng1","chenheng1","chenheng1@163.com"};

        td.updata(insertSql,param1);

        String selectSql="select*from user";
        List<MyUser> list=td.query(selectSql,null);
        for (MyUser mu:list) {
            System.out.println(mu);
        }
    }
}
