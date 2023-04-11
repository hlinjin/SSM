package cn.edu.svtcc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring1 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        Demo03Student student1=(Demo03Student) context.getBean("student1");
        System.out.println(student1);

        Demo03Student student2=(Demo03Student) context.getBean("student2");
        System.out.println(student2);
    }
}