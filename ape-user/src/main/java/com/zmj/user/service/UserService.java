package com.zmj.user.service;

import com.zmj.user.entity.dto.UserDto;


/**
 * @author ZMJ
 * @Package com.zmj.user.service
 * @date 2022/8/21 23:29
 */

public interface UserService {

    int addUser(UserDto userDto);

    int delete(Integer id);

    int update(UserDto userDto , Long id);

}
