package com.jason.order.util;

import com.jason.common.model.Constant;
import com.jason.common.utils.DataUtil;
import com.jason.order.dto.*;
import com.jason.order.model.Cart;
import com.jason.order.model.Order;
import com.jason.order.model.OrderItem;
import com.jason.order.vo.*;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Jason
 * @version 1.0
 * @createTime 2019/9/16 13:15
 * @modify 2019/9/16 13:15
 */
public class ConvertUtil {

    public static CartAddDTO convertCart(CartAddVO cartVO) {
        CartAddDTO addDTO = new CartAddDTO();
        BeanUtils.copyProperties(cartVO, addDTO);
        return addDTO;
    }

    public static Cart convertCart(CartAddDTO addDTO) {
        Cart cart = new Cart();
        BeanUtils.copyProperties(addDTO, cart);
        cart.setStatus(Constant.CART_NORMAL);
        cart.setCreateTime(new Date());
        return cart;
    }

    public static CartUpdateDTO convertCart(CartUpdateVO updateVO) {
        CartUpdateDTO updateDTO = new CartUpdateDTO();
        BeanUtils.copyProperties(updateVO, updateDTO);
        return updateDTO;
    }

    public static Cart convertCart(CartUpdateDTO updateDTO) {
        Cart cart = new Cart();
        BeanUtils.copyProperties(updateDTO, cart);
        cart.setDeleteTime(new Date());
        return cart;
    }

    public static CartDTO convertCart(Cart cart) {
        CartDTO cartDTO = new CartDTO();
        BeanUtils.copyProperties(cart, cart);
        return cartDTO;
    }

    public static CartVO convertCart(CartDTO cartDTO) {
        CartVO cartVO = new CartVO();
        BeanUtils.copyProperties(cartDTO, cartVO);
        return cartVO;
    }

    /**
     * 单号完成设置
     * @param addVO
     * @param orderNumber
     * @return
     */
    public static ItemAddDTO convertItem(ItemAddVO addVO, String orderNumber) {
        ItemAddDTO itemAddDTO = new ItemAddDTO();
        BeanUtils.copyProperties(addVO, itemAddDTO);
        itemAddDTO.setOrderNumber(orderNumber);
        return itemAddDTO;
    }

    /**
     * price需后续计算
     * @param addDTO
     * @return
     */
    public static OrderItem convertItem(ItemAddDTO addDTO) {
        OrderItem orderItem = new OrderItem();
        BeanUtils.copyProperties(addDTO, orderItem);
        orderItem.setTotalPrice(addDTO.getPrice().multiply(new BigDecimal(String.valueOf(addDTO.getCount()))));
        orderItem.setStatus(Constant.ORDER_TO_PAY);
        orderItem.setUpdateTime(new Date());
        return orderItem;
    }

    public static ItemUpdateDTO convertItem(ItemUpdateVO itemUpdateVO) {
        ItemUpdateDTO updateDTO = new ItemUpdateDTO();
        BeanUtils.copyProperties(itemUpdateVO, updateDTO);
        updateDTO.setUpdateTime(new Date());
        return updateDTO;
    }

    public static OrderItem convertItem(ItemUpdateDTO updateDTO) {
        OrderItem orderItem = new OrderItem();
        BeanUtils.copyProperties(updateDTO, orderItem);
        return orderItem;
    }

    public static ItemDTO convertItem(OrderItem item) {
        ItemDTO itemDTO = new ItemDTO();
        BeanUtils.copyProperties(item, itemDTO);
        return itemDTO;
    }

    public static ItemVO convertItem(ItemDTO itemDTO) {
        ItemVO itemVO = new ItemVO();
        BeanUtils.copyProperties(itemDTO, itemVO);
        return itemVO;
    }

    /**
     * 单号生成并传入item
     * @param addVO
     * @return
     */
    public static OrderAddDTO convertOrder(OrderAddVO addVO) {
        OrderAddDTO addDTO = new OrderAddDTO();
        BeanUtils.copyProperties(addVO, addDTO, "items");
        String orderNumber = DataUtil.MD5("Jason" + new Date());
        List<ItemAddDTO> items = new ArrayList<>();
        for (ItemAddVO item : addVO.getItems()) {
            ItemAddDTO itemAdd = convertItem(item, orderNumber);
            items.add(itemAdd);
        }
        addDTO.setItems(items);
        return addDTO;
    }

    /**
     * price需后续计算
     * @param addDTO
     * @return
     */
    public static Order convertOrder(OrderAddDTO addDTO){
        Order order = new Order();
        BeanUtils.copyProperties(addDTO, order);
        order.setAvailable(true);
        order.setCreateTime(new Date());
        order.setStatus(Constant.ORDER_TO_PAY);
        return order;
    }

    public static OrderUpdateDTO convertOrder(OrderUpdateVO updateVO){
        OrderUpdateDTO updateDTO = new OrderUpdateDTO();
        BeanUtils.copyProperties(updateVO, updateDTO);
        return updateDTO;
    }

    public static Order convertOrder(OrderUpdateDTO updateDTO){
        Order order = new Order();
        BeanUtils.copyProperties(updateDTO, order);
        return order;
    }

    /**
     * items在service里赋值
     * @param order
     * @return
     */
    public static OrderDTO convertOrder(Order order){
        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(order, orderDTO);
        return orderDTO;
    }

    public static OrderVO convertOrder(OrderDTO orderDTO){
        OrderVO orderVO = new OrderVO();
        BeanUtils.copyProperties(orderDTO, orderVO);
        return orderVO;
    }

}
