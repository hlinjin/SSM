package com.itheima;

import com.itheima.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring4 {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao1=(UserDao) context.getBean("userDao");
        UserDao userDao2=(UserDao) context.getBean("userDao");


        //userDao1和userDao2是同一个对象
        System.out.println(userDao1);
        System.out.println(userDao2);
    }
}
