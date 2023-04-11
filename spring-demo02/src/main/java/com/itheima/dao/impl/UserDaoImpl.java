package com.itheima.dao.impl;

import com.itheima.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public boolean login(String name,String password){
        if(name.equals("hlj") && password.equals("123")){
            return true;
        }
        return false;
    }
}
