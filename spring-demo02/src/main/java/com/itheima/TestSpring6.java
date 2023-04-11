package com.itheima;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring6 {
    public static void main(String[] args) {
        //初始化容器，容器中已经有了两个
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext2.xml");

    }
}
