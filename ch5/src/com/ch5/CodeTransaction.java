package com.ch5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

@Repository("codeTransaction")
public class CodeTransaction {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private DataSourceTransactionManager txManager;

    public String test(){
        TransactionDefinition tf = new DefaultTransactionDefinition();
        TransactionStatus ts = txManager.getTransaction(tf);
        String message ="执行成功，没有事务回滚！";
        try {
            String sql="delete from user";
            String sql1="insert into user values(?,?,?,?)";
            Object param[]={3,"chenheng1","chenheng1","chenheng@163.com"};

            jdbcTemplate.update(sql);
            jdbcTemplate.update(sql1,param);
            txManager.commit(ts);
        }catch(Exception e){
            txManager.rollback(ts);
            message="主键重复，事务回滚";
            e.printStackTrace();
        }
        return message;
    }
}
