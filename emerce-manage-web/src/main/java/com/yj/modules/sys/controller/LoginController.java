package com.yj.modules.sys.controller;

import com.yj.modules.sys.entity.SysUser;
import com.yj.modules.sys.service.SysUserService;
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
    @Autowired
    SysUserService sysUserService;

    @RequestMapping(value="/loginTest")
    public String loginAAA(){
        System.out.println("bbbbbb");
        return "index";
    }

    @RequestMapping(value="/login1")
    public String loginTest(){
        System.out.println("bbbbbb");
        return "";
    }


    @RequestMapping(value="/login")
    public String login(){
        List<SysUser> list=sysUserService.queryList();
        for(SysUser sysUser:list){
            System.out.println(sysUser.getLoginName());
        }
        System.out.println("bbbbbb");
        return "";
    }





}
