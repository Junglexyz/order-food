package com.jungle.order.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @description: redis生成数据库表主键
 * @author: jungle
 * @create: 2020-02-09 09:33
 */
@Component
public class DbKeyManager {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    /**
     * 生成order_id
     * 前缀prefix = 10000
     */
    public Long orderKey(){
        long order_id = stringRedisTemplate.opsForValue().increment("order_id", 1);
        int prefix = 10000;
        long result = prefix + order_id;
        return  result;
    }
}
