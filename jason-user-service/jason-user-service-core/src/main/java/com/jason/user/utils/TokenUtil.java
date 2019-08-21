package com.jason.user.utils;

import com.jason.common.utils.RedisUtil;
import com.jason.user.model.User;

/**
 * @Author Jason
 * @CreateTime 2019/8/21 9:10
 * @Modify 2019/8/21 9:10
 * @Version 1.0
 */
public class TokenUtil {

    /**
     * 可以通过username获取token， 也可通过token获取user数据
     * 仅限用户自身动作
     *
     * @param user
     */
    public static void flushToken(User user) {
        String token = RedisUtil.get(user.getUsername());
        addToken(token, user);
    }

    /**
     * 添加user缓存数据
     * @param token
     * @param user
     */
    public static void addToken(String token, User user) {
        RedisUtil.put(user.getUsername(), token, 30);
        RedisUtil.put(token, user, 30);
    }
}
