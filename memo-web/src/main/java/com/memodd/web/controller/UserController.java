package com.memodd.web.controller;

import com.google.gson.JsonObject;
import com.memodd.entity.User;
import com.memodd.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.spring.web.json.Json;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Slf4j
@RestController
@RequestMapping(value="user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUserById",method = RequestMethod.GET)
    public User getUserById(HttpServletRequest request) {
        Integer userId = Integer.parseInt(request.getParameter("userId"));
        User user = userService.getUserById(userId);
        return user;
    }

    @RequestMapping(value = "/getAllUser",method = RequestMethod.GET)
    public List<User> getAllUser(HttpServletRequest request) {
        System.out.println("api : the get all user");
        List<User> userList = new ArrayList<User>();
        userList = userService.getAllUser();
        return userList;
    }



    @RequestMapping(value = "showUser")
    public User showUser() {
        log.info("to show user page");
        User user = new User();
        user.setUserName("中国");
        user.setUserId(100);
        user.setBirthday(new Date());
        return user;
    }

    @RequestMapping(value = "showUsers",method = RequestMethod.GET)
    public User showUsers(HttpServletRequest request) {
        log.info("to show user page" + request.getParameter("userName"));
        User user = new User();
        user.setUserName("中国");
        user.setUserId(100);
        user.setBirthday(new Date());
        return user;
    }

    @RequestMapping(value = "addUser", method = RequestMethod.POST)
    public User addUser(@RequestBody JsonObject userInfo) {
        try {
            String userName = userInfo.get("userName").getAsString();
            Boolean bbb = userInfo.get("userAgaaa")==null?true:false;
            Integer userAge = StringUtils.isEmpty(userInfo.get("userAge").getAsString()) ? null : Integer.parseInt(userInfo.get("userAge").getAsString());

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        User user = new User();
        user.setUserName("北京");
        user.setBirthday(new Date());


        return user;
    }

    @RequestMapping(value = "addUser2", method = RequestMethod.POST)
    public User addUser2(@RequestBody Object userInfo) {
        User user = new User();
        user.setUserName("北京");
        user.setBirthday(new Date());

        try {

//            String userName = userInfo.get("userName").getAsString();
//            Boolean aa = userInfo.get("userAge").isJsonNull();
//            Boolean bbb = userInfo.get("userAgaaa")==null?true:false;
//            Integer userAge = StringUtils.isEmpty(userInfo.get("userAge").getAsString()) ? null : Integer.parseInt(userInfo.get("userAge").getAsString());


        } catch (Exception ex) {
            ex.printStackTrace();
        }


        return user;
    }
}
