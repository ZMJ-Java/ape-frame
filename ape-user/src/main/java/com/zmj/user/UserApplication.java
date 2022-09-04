package com.zmj.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author ZMJ
 * @Package com.zmj.user
 * @date 2022/8/13 15:10
 */
@SpringBootApplication
@MapperScan(value = "com.zmj.*.mapper")
@ComponentScan(value = "com.zmj")
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class);
    }
}
