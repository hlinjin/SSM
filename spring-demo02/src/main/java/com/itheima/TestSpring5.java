package com.itheima;

import com.itheima.domain.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");


        Student student=(Student) context.getBean("student");
        System.out.println(student);

    }
}
