import cn.edu.svtcc.pojo.Menu;
import cn.edu.svtcc.service.IMenuService;
import cn.edu.svtcc.service.impl.MenuServiceImpl;
import org.junit.Test;

import java.util.List;

public class MenuServiceTest {
    @Test
    public void test1(){
        IMenuService menuService=new MenuServiceImpl();


        Menu menu=new Menu();
        menu.setMenuName("测试菜单1");

        List<Menu> list=menuService.getList(menu);
        System.out.println(list);
    }
}
