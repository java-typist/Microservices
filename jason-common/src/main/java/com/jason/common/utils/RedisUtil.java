package com.jason.common.utils;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import java.util.concurrent.TimeUnit;

/**
 * @Author Jason
 * @CreateTime 2019/8/20 14:02
 * @Modify 2019/8/20 14:02
 * @Version 1.0
 */
public class RedisUtil {

    /**
     * redis操作工具
     *
     * @param key
     * @param value 值
     * @param time  有效时间，单位为分钟
     * @param <T>
     */
    public static <T> void put(String key, T value, Integer time) {
        RedisTemplate<String, T> redisTemplate = new RedisTemplate<>();
        ValueOperations<String, T> operations = redisTemplate.opsForValue();
        operations.set(key, value, time, TimeUnit.MINUTES);
    }

    /**
     * redis操作工具
     *
     * @param key
     * @param <T> value
     * @return
     */
    public static <T> T get(String key) {
        RedisTemplate<String, T> redisTemplate = new RedisTemplate<>();
        ValueOperations<String, T> operations = redisTemplate.opsForValue();
        return operations.get(key);
    }

    /**
     * 删除某个缓存记录
     * @param key
     * @param <T>
     */
    public static <T> void remove(String key) {
        RedisTemplate<String, T> redisTemplate = new RedisTemplate<>();
        redisTemplate.delete(key);
    }
}
