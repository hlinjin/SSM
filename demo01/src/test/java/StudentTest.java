import cn.edu.svtcc.pojo.Student;
import cn.edu.svtcc.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;

public class StudentTest {
    @Test
    public void testSelectStudentById() throws IOException {
        //读取文件名
        String resources = "mybatis-config.xml";
        //创建流
        Reader reader = null;

        //读取mybatis-config.xml文件内容到reader对象中
        reader = Resources.getResourceAsReader(resources);

        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(reader);
        //创建SqlSession实例
        SqlSession sqlsession = build.openSession();
        //传入参数查询，返回结果
        Student student = sqlsession.selectOne("selectStudentById", 1);
        //输出结果
        System.out.println(student.toString());
        //关闭session
        sqlsession.close();
    }
}
