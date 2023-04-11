package cn.edu.svtcc.service.impl;

import cn.edu.svtcc.dao.MenuDao;
import cn.edu.svtcc.pojo.Menu;
import cn.edu.svtcc.service.IMenuService;
import cn.edu.svtcc.util.MyBatisUtils;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class MenuServiceImpl extends ServiceImpl<MenuDao,Menu> implements IMenuService {

    public List<Menu> getList(Menu menu) {
        List<Menu> menus=null;
        //写查询
        SqlSession session=MyBatisUtils.getSession();
        MenuDao mapper = session.getMapper(MenuDao.class);

        //构建查询条件
        QueryWrapper<Menu> wrapper=new QueryWrapper<Menu>();
        LambdaQueryWrapper<Menu> wrapper1=new LambdaQueryWrapper<Menu>();
        if (menu.getMenuId()!=null){
            wrapper.eq("menu_id",menu.getMenuId());

        }
        if (menu.getMenuName()!=null){
            wrapper.like("menu_name",menu.getMenuName());

        }


        menus = mapper.selectList(wrapper);


        session.close();
        return menus;
    }
}
