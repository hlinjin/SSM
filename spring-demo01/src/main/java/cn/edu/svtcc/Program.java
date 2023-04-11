package cn.edu.svtcc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {
    public static void main(String[] args){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloSpring helloSpring = (HelloSpring) applicationContext.getBean("helloSpring");
        helloSpring.show();

        HelloSpring helloSpring2= (HelloSpring) applicationContext.getBean("helloSpring2");
        helloSpring2.show();


    }
}
