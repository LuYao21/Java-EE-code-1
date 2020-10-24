package com.statement.service;

import com.statement.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;

public class TestServiceImpl implements TestService {
    @Autowired
    private TestDao testDao;
    @Override
    public int save(String sql, Object[] param) {
        return testDao.save(sql,param);
    }

    @Override
    public int delete(String sql, Object[] param) {
        return testDao.delete(sql, param);
    }
}
