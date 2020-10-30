package com.dao;

import com.po.Person;
import com.pojo.SelectPersonById;

public interface PersonDao {
    public Person selectPersonById1(Integer id);
    public Person selectPersonById2(Integer id);
    public SelectPersonById selectPersonById3(Integer id);
}
