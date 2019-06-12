package com.yj.modules.sys.controller;

import com.yj.modules.sys.entity.SysUser;
import com.yj.modules.sys.service.SysUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller

//@RestController
@RequestMapping(value = "sysUser")
//@RequestMapping(value="${adminPath}")
public class LoginController {
    protected static final Logger logger= LoggerFactory.getLogger(LoginController.class);
    private String loginName;
    private String password;
    @Autowired
    SysUserService sysUserService;

    @RequestMapping(value="/loginTest")
    public String loginAAA(){
        System.out.println("bbbbbb");
        return "pages/sys/index";
    }





    @RequestMapping(value="/logintest")
    public String loginTest(){
        List<SysUser> list=sysUserService.queryList();
        for(SysUser sysUser:list){
            System.out.println(sysUser.getLoginName());
        }
        System.out.println("bbbbbb");
        return "";
    }


    @RequestMapping(value="/login")
    public String login(String loginName,String password){
        logger.info("user login :"+loginName+"----"+password);
        SysUser loginUser=new SysUser();
        loginUser.setLoginName(loginName);
        SysUser user=sysUserService.queryByLoginName(loginUser);
        if(user.getPassword().equals(user.getPassword())){
        }
        System.out.println("bbbbbb");
        return "pages/sys/index";
    }




}
