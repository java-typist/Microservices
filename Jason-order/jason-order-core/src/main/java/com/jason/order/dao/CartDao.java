package com.jason.order.dao;

import com.jason.order.dto.CartDTO;
import com.jason.order.model.Cart;

import java.util.Date;
import java.util.List;

/**
 * @author Jason
 * @version 1.0
 * @createTime 2019/9/16 11:45
 * @modify 2019/9/16 11:45
 */
public interface CartDao {

    CartDTO getCart(Integer id);

    List<CartDTO> getCarts(Integer userId);

    Integer addCart(Cart cart);

    Integer updateCart(Cart cart);

    Integer deleteCart(Integer id, Date time);
}
