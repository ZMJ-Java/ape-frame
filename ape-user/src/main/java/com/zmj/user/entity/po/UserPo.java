package com.zmj.user.entity.po;

import com.baomidou.mybatisplus.annotation.*;
import com.zmj.entity.BaseEntity;
import lombok.Data;


/**
 * @author ZMJ
 * @Package com.zmj.user.entity.po
 * @date 2022/8/21 23:10
 */
@TableName("user")
@Data
public class UserPo extends BaseEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String name;

    private Integer age;


}
