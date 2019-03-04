package com.yj;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
//MACBOOKPRO-FAAE
@SpringBootApplication(scanBasePackages = {"com.yj"})
@ServletComponentScan
public class AppStart extends SpringBootServletInitializer{

    public static void main(String[] args) {
        SpringApplication.run(AppStart.class,args);
    }


//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        // 注意这里要指向原先用main方法执行的Application启动类
//        return builder.sources(AppStart.class);
//    }
}
