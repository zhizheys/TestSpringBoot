package com.memodd.dao;

import com.memodd.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

public interface UserDao {
    User getUserById(@Param("userId") Integer userId);
    List<User> getUserByName(@Param("userName") String userName);
    List<User> getAllUser();
}
