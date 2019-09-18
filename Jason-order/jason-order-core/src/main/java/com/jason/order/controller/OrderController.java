package com.jason.order.controller;

import com.jason.common.model.Response;
import com.jason.order.service.OrderService;
import com.jason.order.util.ConvertUtil;
import com.jason.order.vo.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author Jason
 * @CreateTime 2019/9/9 16:14
 * @Modify 2019/9/9 16:14
 * @Version 1.0
 */
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/order")
    public Response order(@RequestParam(value = "orderNumber") String orderNumber) {
        Response response = new Response();
        OrderVO order = orderService.getOrder(orderNumber);
        if (order == null) {
            response.error(-1, "参数错误");
        } else {
            response.success(1, "操作成功", order);
        }
        return response;
    }

    @DeleteMapping("/order")
    public Response delete(@RequestParam(value = "orderNumber") String orderNumber) {
        Response response = new Response();
        Integer result = orderService.deleteOrder(orderNumber);
        if (result > 0) {
            response.success(1, "操作成功", null);
        } else {
            response.error(-1, "操作失败");
        }
        return response;
    }

    @PostMapping("/order")
    public Response addOrder(@RequestBody OrderAddVO order) {
        Response response = new Response();
        Integer result = orderService.addOrder(ConvertUtil.convertOrder(order));
        return response;
    }

    @PutMapping("/order")
    public Response updateOrder(@RequestBody OrderUpdateVO order) {
        Response response = new Response();
        Integer result = orderService.updateOrder(ConvertUtil.convertOrder(order));
        if (result > 0) {
            response.success(1, "操作成功", null);
        } else {
            response.error(-1, "操作失败");
        }
        return response;
    }

    @PostMapping("/cart")
    public Response addCart(@RequestBody CartAddVO cart) {
        Response response = new Response();
        Integer result = orderService.addCart(ConvertUtil.convertCart(cart));
        if (result > 0) {
            response.success(1, "操作成功", null);
        } else {
            response.error(-1, "操作失败");
        }
        return response;
    }

    @PutMapping("/cart")
    public Response updateCart(@RequestBody CartUpdateVO cart) {
        Response response = new Response();
        Integer result = orderService.updateCart(ConvertUtil.convertCart(cart));
        if (result > 0) {
            response.success(1, "操作成功", null);
        } else {
            response.error(-1, "操作失败");
        }
        return response;
    }

    @DeleteMapping("/cart")
    public Response deleteCart(@RequestParam(value = "id") Integer id) {
        Response response = new Response();
        Integer result = orderService.deleteCart(id);
        if (result > 0) {
            response.success(1, "操作成功", null);
        } else {
            response.error(-1, "操作失败");
        }
        return response;
    }

    @GetMapping("/cart")
    public Response cart(@RequestParam(value = "userId") Integer userId) {
        Response response = new Response();
        List<CartVO> carts = orderService.getCarts(userId);
        if (carts == null) {
            response.error(-1, "非法数据");
        } else {
            response.success(1, "操作成功", carts);
        }
        return response;
    }

}
