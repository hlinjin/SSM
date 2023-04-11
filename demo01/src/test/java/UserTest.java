
import cn.edu.svtcc.dao.UserDao;
import cn.edu.svtcc.pojo.User;
import cn.edu.svtcc.util.MyBatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class UserTest {


    @Test
    public void testSelectUserById() throws IOException {
        //读取文件名
        String resources = "mybatis-config.xml";
        //创建流
        Reader reader = null;

        //读取mybatis-config.xml文件内容到reader对象中
        reader = Resources.getResourceAsReader(resources);

        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(reader);
        //创建SqlSession实例
        SqlSession sqlsession = build.openSession();
        SqlSession sqlsession1 = build.openSession();
        //传入参数查询，返回结果
        UserDao userDao=sqlsession.getMapper(UserDao.class);
        User user=userDao.selectUserById(2L);
        //输出结果
        System.out.println(user.toString());


        UserDao userDao1=sqlsession1.getMapper(UserDao.class);
        User user1=userDao1.selectUserById(4L);
        System.out.println(user1.toString());
        //关闭session
        sqlsession.close();
        sqlsession1.close();
    }
    @Test
    public void testSelectUserByName() throws IOException {
        SqlSession sqlSession= MyBatisUtils.getSession();
        //执行方法
        UserDao userDao=sqlSession.getMapper(UserDao.class);
        List<User> users=userDao.selectUserByName("hlj");
        //输出结果
        System.out.println(users.toString());
        //关闭session
        sqlSession.close();
    }
    @Test
    public void testSelectUserByAge() throws IOException {
        //读取文件名
        String resources = "mybatis-config.xml";
        //创建流
        Reader reader = null;

        //读取mybatis-config.xml文件内容到reader对象中
        reader = Resources.getResourceAsReader(resources);

        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(reader);
        //创建SqlSession实例
        SqlSession sqlsession = build.openSession();
        //传入参数查询，返回结果
        UserDao userDao=sqlsession.getMapper(UserDao.class);
        List<User> users=userDao.selectUserByAge(21L);
        //输出结果
        System.out.println(users.toString());
        //关闭session
        sqlsession.close();
    }

    @Test
    public void testAddUser() throws IOException {
        //读取文件名
        String resources = "mybatis-config.xml";
        //创建流
        Reader reader = null;

        //读取mybatis-config.xml文件内容到reader对象中
        reader = Resources.getResourceAsReader(resources);

        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(reader);
        //创建SqlSession实例
        SqlSession sqlsession = build.openSession();
        //传入参数查询，返回结果
        UserDao userDao=sqlsession.getMapper(UserDao.class);
        User user=new User();
        user.setUage(20L);
        user.setUname("hlj");
        userDao.addUser(user);
        sqlsession.commit();
        //关闭session
        sqlsession.close();
    }

    @Test
    public void testUpdateUser() throws IOException {
        //读取文件名
        String resources = "mybatis-config.xml";
        //创建流
        Reader reader = null;

        //读取mybatis-config.xml文件内容到reader对象中
        reader = Resources.getResourceAsReader(resources);

        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(reader);
        //创建SqlSession实例
        SqlSession sqlsession = build.openSession();
        //传入参数查询，返回结果
        UserDao userDao=sqlsession.getMapper(UserDao.class);
        User user=userDao.selectUserById(2L);
        user.setUage(21L);
        user.setUname("hlj1");
        userDao.updateUser(user);
        sqlsession.commit();
        //关闭session
        sqlsession.close();
    }
    public void deleteUser() throws IOException {
        //读取文件名
        String resources = "mybatis-config.xml";
        //创建流
        Reader reader = null;

        //读取mybatis-config.xml文件内容到reader对象中
        reader = Resources.getResourceAsReader(resources);

        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(reader);
        //创建SqlSession实例
        SqlSession sqlsession = build.openSession();
        //传入参数查询，返回结果
        UserDao userDao=sqlsession.getMapper(UserDao.class);
//        User user=new User();
//        user.setUid(1L);
//        user.setUage(21L);
//        user.setUname("hlj1");
        userDao.deleteUser(1L);
        sqlsession.commit();
        //关闭session
        sqlsession.close();

    }
    @Test
    public void testSelectUsersByNameAndAge(){
        SqlSession session=MyBatisUtils.getSession();
        UserDao mapper=session.getMapper(UserDao.class);
        List<User> users=mapper.selectUsersByNameAndAge(null,null);
        System.out.println(users);
    }
    @Test
    public void selectUsers(){
        SqlSession session=MyBatisUtils.getSession();
        UserDao mapper=session.getMapper(UserDao.class);
        User user=new User();
        user.setUname("tbt");
        user.setUage(21L);
        List<User> users=mapper.selectUsers(user);
        System.out.println(users);
    }
    @Test
    public void testDeleteUserByIds(){
        SqlSession session=MyBatisUtils.getSession();
        UserDao mapper=session.getMapper(UserDao.class);
        Long[] userIds=new Long[]{20L,21L,22L,23L,24L};
        mapper.deleteUserByIds(userIds);
        session.commit();
        session.close();
    }
}


