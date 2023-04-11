import cn.edu.svtcc.dao.EmployeeDao;
import cn.edu.svtcc.pojo.Employee;
import cn.edu.svtcc.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import org.apache.ibatis.io.Resources;

import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class EmployeeTest {
    @Test
    public void testEmployee() throws IOException {
        EmployeeTest employeeTest=new EmployeeTest();
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你要执行的功能:"+"1:查询"+"2:添加"+"3:更新"+"4:删除");
        int gn= scanner.nextInt();
        switch (gn){
            case 1:
                System.out.println("请输入你要查询的id");
                Long id=scanner.nextLong();
                employeeTest.testSelectEmployeeById(id);
                break;
            case 2:
                System.out.println("请输入你要添加的员工信息:");
                System.out.println("姓名");
                String name=scanner.next();
                System.out.println("年龄");
                Long age=scanner.nextLong();
                System.out.println("职位");
                String position=scanner.next();
                employeeTest.testAddEmployee(name,age,position);
                break;
            case 3:
                System.out.println("请输入你要更新员工信息的id");
                id=scanner.nextLong();
                System.out.println("请输入你要修改的名字");
                name=scanner.next();
                System.out.println("请输入你要修改的年龄");
                age=scanner.nextLong();
                System.out.println("请输入你要修改的职位");
                position=scanner.next();
                employeeTest.testUpdateEmployee(id,name,age,position);
                break;
            case 4:
                System.out.println("请输入你要删除的员工信息的id");
                id=scanner.nextLong();
                employeeTest.testDeleteEmployee(id);
                break;
        }
    }


    public void testSelectEmployeeById(Long i) throws IOException {
        String resources="mybatis-config.xml";
        Reader reader=null;
        reader= Resources.getResourceAsReader(resources);
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        SqlSessionFactory build=sqlSessionFactoryBuilder.build(reader);
        SqlSession sqlsession=build.openSession();
        EmployeeDao employeeDao=sqlsession.getMapper(EmployeeDao.class);
        Employee employee=employeeDao.selectEmployeeById(i);
        System.out.println(employee.toString());
        sqlsession.close();
    }

    public void testAddEmployee(String n,Long a,String p) throws IOException {
        String resources="mybatis-config.xml";
        Reader reader=null;
        reader= Resources.getResourceAsReader(resources);
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        SqlSessionFactory build=sqlSessionFactoryBuilder.build(reader);
        SqlSession sqlsession=build.openSession();
        EmployeeDao employeeDao=sqlsession.getMapper(EmployeeDao.class);
        Employee employee=new Employee();
        employee.setAge(a);
        employee.setName(n);
        employee.setPosition(p);
        employeeDao.addEmployee(employee);
        sqlsession.commit();
        sqlsession.close();
    }

    public void testUpdateEmployee(Long i,String n,Long a,String p) throws IOException {
        String resources="mybatis-config.xml";
        Reader reader=null;
        reader= Resources.getResourceAsReader(resources);
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        SqlSessionFactory build=sqlSessionFactoryBuilder.build(reader);
        SqlSession sqlsession=build.openSession();
        EmployeeDao employeeDao=sqlsession.getMapper(EmployeeDao.class);
        Employee employee=employeeDao.selectEmployeeById(i);
        employee.setAge(a);
        employee.setName(n);
        employee.setPosition(p);
        employeeDao.updateEmployee(employee);
        sqlsession.commit();
        sqlsession.close();
    }

    public void testDeleteEmployee(Long i) throws IOException {
        String resources="mybatis-config.xml";
        Reader reader=null;
        reader= Resources.getResourceAsReader(resources);
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        SqlSessionFactory build=sqlSessionFactoryBuilder.build(reader);
        SqlSession sqlsession=build.openSession();
        EmployeeDao employeeDao=sqlsession.getMapper(EmployeeDao.class);

        employeeDao.deleteEmployee(i);
        sqlsession.commit();
        sqlsession.close();
    }
}
