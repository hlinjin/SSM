package com.itheima.controller;

import com.itheima.service.IUserService;
import com.itheima.service.impl.UserServiceImpl;

public class UserController {


    public UserController(UserServiceImpl userService) {

    }

    public boolean login(String userName, String password){
        IUserService userService = null;
        boolean result=userService.login(userName,password);
        return result;
    }
}
