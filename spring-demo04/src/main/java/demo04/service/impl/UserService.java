package demo04.service.impl;

import demo04.dao.IUserDao;
import demo04.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService implements IUserService {
    @Resource
    private IUserDao userDao;
    public boolean login(String userName,String password){
        return userDao.login(userName,password);
    }
}
