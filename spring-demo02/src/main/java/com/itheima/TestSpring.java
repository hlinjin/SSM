package com.itheima;

import com.itheima.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args){
        //加载applicationContext.xml配置
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取配置中的UserService
        IUserService userService=(IUserService) applicationContext.getBean("userService");
        boolean result = userService.login("hlj", "123");
        System.out.println(result);
    }
}
