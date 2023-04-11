package com.itheima.domain;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Student {
    private Long number;//学号
    private String name;//姓名
    private List<String> hobbys;//学生的爱好
    private Double[] scores;//学生的成绩
    private Double[] salary;//工资
    private Map<String,Double> courses;//学生的课程加分数
    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Student() {
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getHobbys() {
        return hobbys;
    }

    public void setHobbys(List<String> hobbys) {
        this.hobbys = hobbys;
    }

    public Double[] getScores() {
        return scores;
    }

    public void setScores(Double[] scores) {
        this.scores = scores;
    }

    public Double[] getSalary() {
        return salary;
    }

    public void setSalary(Double[] salary) {
        this.salary = salary;
    }

    public Map<String, Double> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, Double> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", hobbys=" + hobbys +
                ", scores=" + Arrays.toString(scores) +
                ", salary=" + Arrays.toString(salary) +
                ", courses=" + courses +
                ", dept=" + dept +
                '}';
    }
}
