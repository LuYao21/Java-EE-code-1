package com.dao;

import com.mybatis.po.myUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userDao")
@Mapper
public interface UserDao {
    /**
     * 接口方法对应SQL映射文件UserMapper.xml中的id
     */
    public myUser selectUserById(Integer id);
    public List<myUser> selectAllUser();
    public int addUser(myUser user);
    public int updateUser(myUser user);
    public int deleteUser(Integer id);
}
