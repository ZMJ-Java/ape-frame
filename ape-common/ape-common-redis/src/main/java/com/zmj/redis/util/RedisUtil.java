package com.zmj.redis.util;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @author ZMJ
 * @Package com.zmj.redis.util
 * @date 2022/9/25 22:52
 */
@Component
public class RedisUtil {

    @Autowired
    private RedisTemplate redisTemplate;

    public void set(String key , String value){
        redisTemplate.opsForValue().set(key,value);
    }


    public String get(String key ){
        String value = (String) redisTemplate.opsForValue().get(key);
        return value;
    }

}
