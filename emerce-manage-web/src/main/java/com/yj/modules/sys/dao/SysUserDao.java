package com.yj.modules.sys.dao;

import com.yj.modules.sys.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface SysUserDao {
    List<SysUser> queryList();

    SysUser queryByLoginName(SysUser sysUser);
}
