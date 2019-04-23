package com.memodd.web.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value="/login")
public class Login {

    //post登录
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@RequestBody Map map){
        //添加用户认证信息
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(
                map.get("username").toString(),
                map.get("password").toString());

        subject.login(usernamePasswordToken);
        return "login";
    }


    //post登录
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){
        return "please login";
    }

    @RequestMapping(value = "/show",method = RequestMethod.GET)
    public String show(){
        return "the login show";
    }

}
