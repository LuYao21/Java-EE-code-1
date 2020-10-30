package com.dao;

import com.po.MyUser;
import com.pojo.SeletUserParam;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userDao")
@Mapper
public interface UserDao {
    /**
     * 接口方法对应SQL映射文件UserMapper.xml中的id
     */
    public MyUser selectUserById(Integer id);
    public List<MyUser> selectAllUser(SeletUserParam param);
    public int addUser(MyUser user);
    public int updateUser(MyUser user);
    public int deleteUser(Integer id);
}
