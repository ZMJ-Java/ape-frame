package com.zmj.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author ZMJ
 * @Package com.zmj.entity
 * @date 2022/9/3 12:16
 */

@Data
public class BaseEntity implements Serializable {

    @TableField(fill = FieldFill.INSERT)
    private String createBy;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @TableField(fill = FieldFill.UPDATE)
    private String updateBy;

    @TableField( fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;

    @TableField(fill = FieldFill.INSERT)
    @TableLogic
    private Integer deleteFlag;

    @TableField(fill = FieldFill.INSERT)
    private Integer version;
}
