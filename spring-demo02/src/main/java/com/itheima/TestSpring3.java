package com.itheima;

import com.itheima.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestSpring3 {
    public static void main(String[] args) {
        //1.初始化容器
        String path="D:\\SSM\\demo\\spring-demo02\\src\\main\\resources\\applicationContext.xml";
        ApplicationContext context=new FileSystemXmlApplicationContext(path);

        UserDao userDao=(UserDao) context.getBean("userDao");
        System.out.println(userDao);
    }
}
