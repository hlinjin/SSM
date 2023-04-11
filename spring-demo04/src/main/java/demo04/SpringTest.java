package demo04;

import demo04.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController userController =(UserController) context.getBean("userController");
        boolean result=userController.login("hlj","123");
        System.out.println(result);
    }
}
