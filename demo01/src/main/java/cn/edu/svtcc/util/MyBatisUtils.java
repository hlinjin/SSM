package cn.edu.svtcc.util;

import com.baomidou.mybatisplus.core.MybatisSqlSessionFactoryBuilder;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.io.Reader;

public class MyBatisUtils {
    private static SqlSessionFactory factory=null;

    static {
        try{
            Reader reader= Resources.getResourceAsReader("mybatis-config.xml");

            factory=new MybatisSqlSessionFactoryBuilder().build(reader);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static SqlSession getSession(){
        SqlSession sqlSession=factory.openSession();
        return sqlSession;
    }
}
