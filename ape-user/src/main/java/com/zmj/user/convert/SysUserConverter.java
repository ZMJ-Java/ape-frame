package com.zmj.user.convert;

import com.zmj.user.entity.po.SysUser;
import com.zmj.user.entity.req.SysUserReq;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @author ZMJ
 * @Package com.zmj.user.convert
 * @date 2022/9/17 8:46
 */
@Mapper
public interface SysUserConverter {
    SysUserConverter INSTANCE = Mappers.getMapper(SysUserConverter.class);

   /**字段不一致时映射 @Mapping(source = "age" ,target = "age1")*/
    SysUser convertReqToSysUser(SysUserReq sysUserReq);
}
