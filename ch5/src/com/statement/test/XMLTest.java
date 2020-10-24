package com.statement.test;

import com.statement.controller.StatementController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLTest {
    public static void main(String[] args) {
        ApplicationContext appCon=new ClassPathXmlApplicationContext("com/statement/xmll/XMLstatementapplicationContext.xml");
        StatementController ct = (StatementController)appCon.getBean("statementController");
        String result=ct.test();
        System.out.println(result);
    }
}
