package demo04.controller;

import demo04.service.IUserService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Resource
    private IUserService userService;
    public boolean login(String userName,String password){
        return userService.login("hlj","123");
    }
}
