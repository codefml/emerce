package com.yj.modules.sys.dao;

import com.yj.modules.sys.entity.SysRole;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysRoleDao {
    List<SysRole> queryList();
}
