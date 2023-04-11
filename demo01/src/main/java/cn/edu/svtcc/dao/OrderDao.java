package cn.edu.svtcc.dao;

import cn.edu.svtcc.pojo.Order;

import java.util.List;

public interface OrderDao {
    //根据用户编号查询订单信息
    List<Order> getOrdersByUserId(Long userId);
}
