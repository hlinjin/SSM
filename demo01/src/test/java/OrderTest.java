import cn.edu.svtcc.dao.OrderDao;
import cn.edu.svtcc.pojo.Order;
import cn.edu.svtcc.pojo.OrderItem;
import cn.edu.svtcc.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class OrderTest {
    @Test
    public void testGetOrderByUserId(){
        SqlSession session= MyBatisUtils.getSession();
        OrderDao mapper=session.getMapper(OrderDao.class);
        List<Order> orders=mapper.getOrdersByUserId(3L);
        for (Order order:orders){
            System.out.println(order);
            for (OrderItem orderItem: order.getOrderItems()){
                System.out.println(orderItem);
            }
            System.out.println("----------------------------");
        }
        session.close();
    }

}
