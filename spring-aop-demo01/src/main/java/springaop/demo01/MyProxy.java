package springaop.demo01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyProxy implements InvocationHandler {

    //声明目标类接口
    private UserDao userDao;
    //创建代理方法
    public Object createProxy(UserDao userDao){
        this.userDao=userDao;
        //1.类加载器
        ClassLoader classLoader=MyProxy.class.getClassLoader();
        //2.被代理对象实现的所有接口
        Class[] classes=userDao.getClass().getInterfaces();
        //3.使用代理类进行加强
        Object o=Proxy.newProxyInstance(classLoader,classes,this);
        //返回的是代理对象
        return o;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //创建切面对象
        MyAspsect myAspsect=new MyAspsect();
        //前增强
        myAspsect.checkPermissions();
        //在目标类上调用方法，并传入参数
        Object invoke=method.invoke(userDao,args);
        //后增强
        myAspsect.log();
        return invoke;
    }

}
