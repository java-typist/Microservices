package com.jason.common.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.util.StringUtils;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @Author Jason
 * @CreateTime 2019/8/20 14:02
 * @Modify 2019/8/20 14:02
 * @Version 1.0
 */
public class RedisUtil {

    private static RedisTemplate redisTemplate;

    /**
     * autowired配置静态变量
     * @param redisTemplate
     */
    @Autowired
    private void init(RedisTemplate redisTemplate){
        RedisUtil.redisTemplate = redisTemplate;
    }

    /**a
     * redis操作工具
     *
     * @param key
     * @param value 值
     * @param time  有效时间，单位为分钟
     * @param <T>
     */
    public static <T> void put(String key, T value, Integer time) {
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
        ValueOperations<String, T> operations = redisTemplate.opsForValue();
        return operations.get(key);
    }

    /**
     * 删除某个缓存记录
     *
     * @param key
     * @param <T>
     */
    public static <T> void remove(String key) {
        RedisTemplate<String, T> redisTemplate = new RedisTemplate<>();
        redisTemplate.delete(key);
    }

    public static String create(String key) {
        if (StringUtils.isEmpty(key)) {
            return null;
        }
        String secretKey;
        RedisTemplate<String, String> redisTemplate = new RedisTemplate<>();
        if (redisTemplate.hasKey(key)) {
            if (redisTemplate.boundHashOps(key).getExpire() < 1000 * 60) {
                redisTemplate.opsForValue().set(key, DataUtil.MD5(UUID.randomUUID().toString()), 30, TimeUnit.MINUTES);
            }
            secretKey = (String) redisTemplate.opsForValue().get(key);
        } else {
            secretKey = DataUtil.MD5(UUID.randomUUID().toString());
            redisTemplate.opsForValue().set(key, secretKey, 30, TimeUnit.MINUTES);
        }
        return secretKey;
    }
}
