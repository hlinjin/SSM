package springaop.demo01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class XmlAdvice {
    /**
     * 创建代理对象之前执行的方法
     * @param pint
     */
    public void before(JoinPoint pint){
        System.out.println("前置通知");
        System.out.println("目标类是："+pint.getTarget());
        System.out.println(",被增强的方法是："+pint.getSignature().getName());
    }
    public Object around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("这是方法执行之前");
        Object proceed=point.proceed();
        System.out.println("这是方法执行之后");
        return proceed;
    }
}
