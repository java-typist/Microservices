package com.jason.common.utils;

import org.springframework.util.DigestUtils;

/**
 * 通用的数据加密，数据简要处理都在此类
 *
 * @Author Jason
 * @CreateTime 2019/8/19 11:37
 * @Modify 2019/8/19 11:37
 * @Version 1.0
 */
public class DataUtil {

    /**
     * MD5加密算法
     *
     * @param text
     * @return
     */
    public static String MD5(String text) {
        return DigestUtils.md5DigestAsHex(text.getBytes());
    }

    /**
     * 分布式ID生成器,snowflake算法
     * @param data
     * @return
     */
    public static synchronized String snowFlake(String data){
        //todo
        return null;
    }
}
