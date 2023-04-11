package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.service.IUserService;

public class UserServiceImpl implements IUserService {
    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    @Override
    public boolean login(String name,String password){
        return userDao.login(name, password);
    }
}
