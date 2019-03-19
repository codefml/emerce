package com.yj.controller;

import com.yj.config.component.ConfigComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="test",method={RequestMethod.GET,RequestMethod.POST})
public class TestController {
    @Autowired
    ConfigComponent configComponent;
   public static Logger logger= LoggerFactory.getLogger(TestController.class);
    @RequestMapping()
    public String hello(){
        logger.info("test controller");
        return "hello world!";
    }
}
