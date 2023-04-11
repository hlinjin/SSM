import cn.edu.svtcc.dao.MenuDao;
import cn.edu.svtcc.pojo.Menu;
import cn.edu.svtcc.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MenuTest {
    @Test
    public void testSelectAll(){
        SqlSession session = MyBatisUtils.getSession();
        MenuDao mapper = session.getMapper(MenuDao.class);

        Long id=2L;

        Menu menus = mapper.selectById(id);

        System.out.println(menus);


        session.close();

    }
    @Test
    public void testInsert(){
        SqlSession session=MyBatisUtils.getSession();
        MenuDao mapper=session.getMapper(MenuDao.class);

        //通过MybaPlus提供的默认方法插入数据到menu
        Menu menu=new Menu();
        menu.setMenuName("测试菜单1");
        menu.setMenuSort(4L);
        menu.setMenuUrl("#");


        mapper.insert(menu);

        session.commit();

        session.close();
    }
    @Test
    public void testUpdate(){
        SqlSession session=MyBatisUtils.getSession();
        MenuDao mapper=session.getMapper(MenuDao.class);

        //通过MybaPlus提供的默认方法插入数据到menu
        Menu menu=new Menu();
        menu.setMenuId(1L);
        menu.setMenuName("测试菜单1");
        menu.setMenuSort(1L);
        menu.setMenuUrl("http://163.com");


        mapper.updateById(menu);

        session.commit();

        session.close();
    }
    @Test
    public void testDelete(){
        SqlSession session=MyBatisUtils.getSession();
        MenuDao mapper=session.getMapper(MenuDao.class);

        mapper.deleteById(4L);

        session.commit();

        session.close();
    }
}
