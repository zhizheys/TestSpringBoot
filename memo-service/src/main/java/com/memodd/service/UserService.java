package com.memodd.service;

import com.memodd.entity.User;

import java.util.List;

public interface UserService {
    User getUserById(Integer userId);
    List<User> getUserByName(String userName);
}
