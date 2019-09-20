package com.jason.common.model;

/**
 * 此类决定本服务中所有特定状态
 *
 * @author Jason
 * @since 2019/8/19 11:30
 * @Modify 2019/8/19 11:30
 * @Version 1.0
 */
public class Constant {

    //user status
    public static final Integer USER_UNAVAILABLE = -2;
    public static final Integer USER_LOCKED = -1;
    public static final Integer USER_UNACTIVE = 0;
    public static final Integer USER_NORMAL = 1;

    //dao操作状态
    public static final Integer MAPPER_SUCCESS = 1;
    public static final Integer MAPPER_FAILURE = -1;

    //request请求结果
    public static final Integer REQUEST_SUCCESS = 1;
    public static final Integer REQUEST_FAILURE = -1;

    public static final Integer ORDER_DELETE = -3;
    public static final Integer ORDER_CANCEL = -2;
    public static final Integer ORDER_TO_PAY = -1;
    public static final Integer ORDER_PAID = 0;
    public static final Integer ORDER_FINISH = 1;

    public static final Integer CART_NORMAL = 0;
    public static final Integer CART_DELETE = -1;
    public static final Integer CART_TO_ORDER = 1;

}
