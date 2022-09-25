package com.zmj.user.controller;

import com.zmj.redis.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZMJ
 * @Package com.zmj.user.controller
 * @date 2022/8/13 16:29
 */
@RestController
public class TestController {
    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private RedisUtil redisUtil;

    @GetMapping("/test")
    public String test() {
        return "hello world";
    }

    @GetMapping("testRedis")
    public String testRedis() {
        redisUtil.set("name", "zmj");
        String name = redisUtil.get("name");
        return name;
    }
}
