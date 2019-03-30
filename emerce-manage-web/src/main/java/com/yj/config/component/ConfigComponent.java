package com.yj.config.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConfigComponent {
    @Value("${adminPath}")
    public String adminPath;
}
