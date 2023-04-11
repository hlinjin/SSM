package cn.edu.svtcc.service;

import cn.edu.svtcc.pojo.Menu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 菜单服务接口
 */
public interface IMenuService extends IService<Menu> {
        List<Menu> getList(Menu menu);
}
