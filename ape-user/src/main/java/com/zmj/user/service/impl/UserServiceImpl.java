package com.zmj.user.service.impl;

import com.zmj.user.entity.dto.UserDto;
import com.zmj.user.entity.po.UserPo;
import com.zmj.user.mapper.UserMapper;
import com.zmj.user.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ZMJ
 * @Package com.zmj.user.service.impl
 * @date 2022/8/21 23:33
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(UserDto userDto) {
        UserPo userPo = new UserPo();
        BeanUtils.copyProperties(userDto, userPo);
        int count = userMapper.insert(userPo);
        return count;
    }

    @Override
    public int delete(Integer id) {
        return userMapper.deleteById(id);
    }

    @Override
    public int update(UserDto userDto, Long id) {
        UserPo userPo = new UserPo();
        userPo.setId(id);
        BeanUtils.copyProperties(userDto, userPo);
        int count = userMapper.updateById(userPo);
        return count;
    }



}
