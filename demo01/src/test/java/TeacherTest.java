import cn.edu.svtcc.dao.TeacherDao;
import cn.edu.svtcc.pojo.Teacher;
import cn.edu.svtcc.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TeacherTest {
    @Test
    public void testSelectById(){
        SqlSession session= MyBatisUtils.getSession();
        TeacherDao mapper=session.getMapper(TeacherDao.class);
        Teacher teacher=mapper.selectById(1L);
        System.out.println(teacher);
    }
    @Test
    public void testSelectAll() {
        SqlSession session = MyBatisUtils.getSession();
        TeacherDao mapper=session.getMapper(TeacherDao.class);
        List<Teacher> teachers=mapper.selectAll();
        System.out.println(teachers);
        session.close();
    }
}
