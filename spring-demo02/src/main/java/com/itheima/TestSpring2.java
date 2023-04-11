package com.itheima;

import com.itheima.service.impl.UserServiceImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestSpring2 {
    public static void main(String[] args) {
        //1.初始化容器
        String path="D:\\SSM\\demo\\spring-demo02\\src\\main\\resources\\applicationContext.xml";
        BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource(path));
        //2.从容器中加载需要的对象
        //通过getBean(name),name是对象的名字，方法从容器中得到对象
        UserServiceImpl userService=(UserServiceImpl) beanFactory.getBean("userService");
        boolean result= userService.login("hlj","123");
        System.out.println(result);

        UserServiceImpl userService1= beanFactory.getBean(UserServiceImpl.class);
        System.out.println(userService1);
    }
}
