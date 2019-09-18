package com.jason.order.dao;

import com.jason.order.dto.OrderDTO;
import com.jason.order.model.Order;

import java.util.List;

/**
 * @author Jason
 * @CreateTime 2019/9/9 16:10
 * @Modify 2019/9/9 16:10
 * @Version 1.0
 */
public interface OrderDao {

    OrderDTO getOrder(String orderNumber);

    List<OrderDTO> getOrders(Integer userId);

    List<OrderDTO> getOrdersByStatus(Integer userId, Integer status);

    Integer addOrder(Order order);

    Integer updateOrder(Order order);

    /**
     * 实际将order available置为false
     * @param orderNumber
     * @return
     */
    Integer deleteOrder(String orderNumber);

}
