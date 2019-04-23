package com.memodd.service.Impl;

import com.memodd.dao.UserDao;
import com.memodd.entity.User;
import com.memodd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Component
@Resource

public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    public User getUserById(Integer userId){
        return userDao.getUserById(userId);
    }

    public List<User> getUserByName(String userName){
        return userDao.getUserByName(userName);
    }


}
