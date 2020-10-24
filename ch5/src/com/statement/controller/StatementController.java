package com.statement.controller;

import com.statement.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;

public class StatementController {
    @Autowired
    private TestService testService;
    public String test(){
        String message="";
        String deleteSql="delete from user";
        String saveSql="insert into user values(?,?,?,?)";
        Object param[]={3,"chenheng","chenheng","chenheng@qq.com"};
        try{
           testService.delete(deleteSql,null);
           testService.save(saveSql,param);
        }catch (Exception e){
            message="主键重复，事务回滚";
            e.printStackTrace();
        }

        return message;
    }
}
