import cn.edu.svtcc.dao.DeptDao;
import cn.edu.svtcc.pojo.Dept;
import cn.edu.svtcc.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class DeptTest {
    @Test
    public void testSelectById(){
        SqlSession session= MyBatisUtils.getSession();
        DeptDao mapper=session.getMapper(DeptDao.class);
        Dept dept =mapper.selectById(1L);
        System.out.println(dept);
        session.close();
    }
}
