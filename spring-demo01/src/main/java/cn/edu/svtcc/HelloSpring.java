package cn.edu.svtcc;

public class HelloSpring {
    private String userName;
    private Long age;
    private Boolean live;

    public HelloSpring() {
    }

    public HelloSpring(String userName, Long age, Boolean live) {
        this.userName = userName;
        this.age = age;
        this.live = live;
    }

    public String getUserName() {
        return userName;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public Boolean getLive() {
        return live;
    }

    public void setLive(Boolean live) {
        this.live = live;
    }

    public void setUserName(String userName){
        this.userName=userName;
    }

    public void show(){
        System.out.println(userName+",欢迎你来到Spring,Age="+age+",Live="+live);
    }
}
