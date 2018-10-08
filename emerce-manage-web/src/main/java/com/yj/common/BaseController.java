package com.yj.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:system.properties")
public abstract class BaseController {
    @Value("${adminPath}")
    public String adminPath;
}
