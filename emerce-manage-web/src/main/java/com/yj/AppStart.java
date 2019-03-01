package com.yj;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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
}
