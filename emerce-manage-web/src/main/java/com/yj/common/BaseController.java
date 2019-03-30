package com.yj.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:system.properties")
public abstract class BaseController {
    public static Logger logger= LoggerFactory.getLogger(Class.class);
//    @Value("${adminPath}")
//    public String adminPath;
}
