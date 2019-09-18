package com.jason.order.service;

import com.jason.order.dto.*;
import com.jason.order.vo.*;

import java.util.List;

/**
 * todo 待实现具体的方法过程
 * @author Jason
 * @version 1.0
 * @createTime 2019/9/12 14:18
 * @modify 2019/9/12 14:18
 */
public interface OrderService {

    /**
     * 创建order，并同时将相关item写入
     *
     * @param orderAdd
     * @return 添加成功后的orderId，失败则为-1
     */
    Integer addOrder(OrderAddDTO orderAdd);

    /**
     * 需把item也删除
     * @param orderNumber
     * @return
     */
    Integer deleteOrder(String orderNumber);

    /**
     * 新建购物车条目,若商品属性已存在，则修改数据即可
     *
     * @param cartAdd
     * @return -1为失败，0为修改数据结果，其余为添加成功后返回的id值
     */
    Integer addCart(CartAddDTO cartAdd);

    /**
     * 删除购物车数据
     * @param cartId
     * @return
     */
    Integer deleteCart(Integer cartId);

    /**
     * @param orderUpdate
     * @return
     */
    Integer updateOrder(OrderUpdateDTO orderUpdate);

    /**
     * @param itemUpdate
     * @return
     */
    Integer updateItem(ItemUpdateDTO itemUpdate);

    Integer updateCart(CartUpdateDTO cartUpdate);

    /**
     * @param itemId
     * @return
     */
    ItemDTO getItem(Integer itemId);

    /**
     * @param orderNumber
     * @return
     */
    OrderVO getOrder(String orderNumber);

    /**
     * 获取某用户当前正常状态的cart数据
     * @param userId
     * @return
     */
    List<CartVO> getCarts(Integer userId);
}
