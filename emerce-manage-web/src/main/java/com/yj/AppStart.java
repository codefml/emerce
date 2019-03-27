package com.yj;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import javax.annotation.Resources;

/**
 * 方式一：默认的application启动，在创建项目时自动生成application启动类，直接run执行即可
 * 方式二：默认的启动类要继承SpringBootServletInitiailzer类，并复写configure()方法
 */
@SpringBootApplication(scanBasePackages = {"com.yj"})
@ServletComponentScan
public class AppStart extends SpringBootServletInitializer{

    public static void main(String[] args) {
        SpringApplication.run(AppStart.class,args);
        //new SpringApplicationBuilder(AppStart.class).web(true).run(args);
    }


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意这里要指向原先用main方法执行的Application启动类
        return builder.sources(AppStart.class);
    }
}
