package com.zmj.user.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zmj.entity.BaseEntity;
import lombok.Data;


/**
 * @author ZMJ
 * @Package com.zmj.user.entity.po
 * @date 2022/8/21 23:10
 */
@TableName("sys_user")
@Data
public class SysUser extends BaseEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String name;

    private Integer age;


}
