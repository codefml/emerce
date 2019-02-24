package com.yj.modules.sys.service.impl;

import com.yj.modules.sys.dao.SysUserDao;
import com.yj.modules.sys.entity.SysUser;
import com.yj.modules.sys.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    SysUserDao sysUserDao;
    @Override
    public List<SysUser> queryList() {
        return sysUserDao.queryList();
    }
}
