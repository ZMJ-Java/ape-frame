package com.zmj.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zmj.user.entity.po.UserPo;
import org.springframework.stereotype.Repository;

/**
 * @author ZMJ
 * @Package com.zmj.user.mapper
 * @date 2022/8/21 23:08
 */
@Repository
public interface UserMapper extends BaseMapper<UserPo> {
}
