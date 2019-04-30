package com.memodd.service.Impl;

import com.memodd.dao.UserDao;
import com.memodd.entity.User;
import com.memodd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Component
@Resource

@CacheConfig(cacheNames = {"myCache"})
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    public User getUserById(Integer userId){
        return userDao.getUserById(userId);
    }

    public List<User> getUserByName(String userName){
        return userDao.getUserByName(userName);
    }

    @Override
    @Cacheable(key = "targetClass + methodName")
    public  List<User> getAllUser(){
        System.out.println("the get all user");
        return  userDao.getAllUser();
    }

}
