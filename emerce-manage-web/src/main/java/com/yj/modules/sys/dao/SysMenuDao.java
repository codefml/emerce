package com.yj.modules.sys.dao;

import com.yj.modules.sys.entity.SysMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface SysMenuDao {

    List<SysMenu> queryList();
}
