package springaop.demo01;

public class Program {
    public static void main(String[] args) {
        //创建代理对象
        MyProxy myProxy=new MyProxy();
        //创建目标对象
        Object proxy = myProxy.createProxy(new UserDaoImpl());
        //从代理对象中获取增强后的目标对象
        UserDao userDao=(UserDao) proxy;
        //执行方法
        userDao.addUser();
        userDao.deleteUser();
    }
}
