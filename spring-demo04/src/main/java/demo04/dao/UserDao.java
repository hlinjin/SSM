package demo04.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao implements IUserDao{
    public boolean login(String userName,String password){
        if (userName.equals("hlj")&& password.equals("123"))
            return true;
        return false;
    }
}
