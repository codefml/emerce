package com.yj.modules.sys.dao;

import com.yj.modules.sys.entity.Depart;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface DepartDao {
    List<Depart> queryList();
}
