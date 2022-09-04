package com.zmj.user.controller;

import com.zmj.bean.Result;
import com.zmj.user.entity.dto.UserDto;
import com.zmj.user.entity.req.UserReq;
import com.zmj.user.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author ZMJ
 * @Package com.zmj.user.controller
 * @date 2022/8/21 23:36
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public Result addUser(@RequestBody UserReq userReq) {
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userReq, userDto);
//        int i = userService.addUser(userDto);
//        int count = 1 / 0;
//        return i;
        return Result.ok(userService.addUser(userDto));

    }


    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id) {

        return Result.ok(userService.delete(id));
    }

    @PutMapping("/update/{id}")
    public Result update(@RequestBody UserReq userReq, @PathVariable Long id) {
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userReq, userDto);
        return Result.ok(userService.update(userDto, id));
    }

}
