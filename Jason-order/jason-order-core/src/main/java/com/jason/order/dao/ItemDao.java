package com.jason.order.dao;

import com.jason.order.dto.ItemDTO;
import com.jason.order.model.OrderItem;

import java.util.List;

/**
 * @author Jason
 * @version 1.0
 * @createTime 2019/9/16 10:42
 * @modify 2019/9/16 10:42
 */
public interface ItemDao {

    ItemDTO getItem(Integer id);

    List<ItemDTO> getItems(String orderNumber);

    Integer addItem(OrderItem item);

    Integer updateItem(OrderItem item);

    Integer deleteItem(String orderNumber);
}
