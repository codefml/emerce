package com.yj.modules.sys.controller;

import com.yj.common.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="${adminPath}")
public class LoginController extends BaseController{
    @RequestMapping(value="/login")
    public String login(){
        System.out.println(adminPath);
        return "";
    }
}
