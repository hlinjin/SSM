package cn.edu.svtcc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student1")
public class Demo03Student {


    @Value("002")
    private String number;
    @Value("hlj2")
    private String name;
    @Value("20")
    private Long age;

    public Demo03Student() {
        System.out.println("无参构造函数被调用了");
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Demo03Student{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
