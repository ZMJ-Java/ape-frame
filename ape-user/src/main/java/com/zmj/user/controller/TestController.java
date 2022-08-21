package com.zmj.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZMJ
 * @Package com.zmj.user.controller
 * @date 2022/8/13 16:29
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "hello world";
    }
}
