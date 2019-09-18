package com.jason.order.serviceImpl;

import com.jason.order.dao.CartDao;
import com.jason.order.dao.ItemDao;
import com.jason.order.dao.OrderDao;
import com.jason.order.dto.*;
import com.jason.order.model.Cart;
import com.jason.order.model.Order;
import com.jason.order.model.OrderItem;
import com.jason.order.service.OrderService;
import com.jason.order.util.ConvertUtil;
import com.jason.order.vo.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Jason
 * @version 1.0
 * @createTime 2019/9/16 9:10
 * @modify 2019/9/16 9:10
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;

    @Resource
    private ItemDao itemDao;

    @Resource
    private CartDao cartDao;

    /**
     * todo 优惠规则以及item的优惠减额策略
     *
     * @param orderAdd
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public Integer addOrder(OrderAddDTO orderAdd) {
        Order order = ConvertUtil.convertOrder(orderAdd);
        List<OrderItem> items = new ArrayList<>();
        for (ItemAddDTO itemAddDTO : orderAdd.getItems()) {
            OrderItem item = ConvertUtil.convertItem(itemAddDTO);
//            todo item详情
        }
        return 1;
    }

    /**
     * 删除order(仅为付款order可执行此操作)，且相关item字段同时删除
     *
     * @param orderNumber
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public Integer deleteOrder(String orderNumber) {
        Integer o = orderDao.deleteOrder(orderNumber);
        Integer i = itemDao.deleteItem(orderNumber);
        if (o > 0 && i > 0) {
            return 1;
        } else {
            try {
                throw new Exception("something items/order to clear");
            } catch (Exception e) {
                e.printStackTrace();
                return -1;
            }
        }
    }

    @Override
    public Integer addCart(CartAddDTO cartAdd) {
        Cart cart = ConvertUtil.convertCart(cartAdd);
        return cartDao.addCart(cart);
    }

    @Override
    public Integer deleteCart(Integer cartId) {
        return cartDao.deleteCart(cartId, new Date());
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Integer updateOrder(OrderUpdateDTO orderUpdate) {
        Order order = ConvertUtil.convertOrder(orderUpdate);
        return orderDao.updateOrder(order);
    }

    @Override
    public Integer updateItem(ItemUpdateDTO itemUpdate) {
        OrderItem item = ConvertUtil.convertItem(itemUpdate);
        return itemDao.updateItem(item);
    }

    /**
     * 后面根据实际需求重构
     *
     * @param cartUpdate
     * @return
     */
    @Override
    public Integer updateCart(CartUpdateDTO cartUpdate) {
        Cart cart = ConvertUtil.convertCart(cartUpdate);
        Integer result = cartDao.updateCart(cart);
        return result;
    }

    @Override
    public ItemDTO getItem(Integer itemId) {
        return itemDao.getItem(itemId);
    }

    @Override
    public OrderVO getOrder(String orderNumber) {
        OrderDTO orderDTO = orderDao.getOrder(orderNumber);
        List<ItemDTO> items = itemDao.getItems(orderNumber);
        orderDTO.setItems(items);
        return ConvertUtil.convertOrder(orderDTO);
    }

    @Override
    public List<CartVO> getCarts(Integer userId) {
        List<CartDTO> carts = cartDao.getCarts(userId);
        List<CartVO> cartVOS = new ArrayList<>();
        for (CartDTO cart : carts) {
            cartVOS.add(ConvertUtil.convertCart(cart));
        }
        return cartVOS;
    }
}
