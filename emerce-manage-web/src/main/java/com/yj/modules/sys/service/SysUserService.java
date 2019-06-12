package com.yj.modules.sys.service;

import com.yj.modules.sys.dao.SysUserDao;
import com.yj.modules.sys.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserService  {
    @Autowired
    SysUserDao sysUserDao;
    public List<SysUser> queryList() {
        return sysUserDao.queryList();
    }

    
    public SysUser queryByLoginName(SysUser sysUser){
        return sysUserDao.queryByLoginName(sysUser);
    }
}
