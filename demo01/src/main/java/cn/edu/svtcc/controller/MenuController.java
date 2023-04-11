package cn.edu.svtcc.controller;

import cn.edu.svtcc.pojo.Menu;
import cn.edu.svtcc.service.IMenuService;

/**
 * 控制层
 * 用来接收用户的请求，将处理的结果反馈给客户端
 */
public class MenuController {
    //针对服务层的对象
    private IMenuService menuService;



    //添加
    public void Add(Menu menu){
        menuService.save(menu);
    }
}
