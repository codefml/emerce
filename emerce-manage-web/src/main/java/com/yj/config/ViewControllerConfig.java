package com.yj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@Configuration
public class ViewControllerConfig extends WebMvcConfigurationSupport {


    /**
     * View - Controller 映射配置
     */
    @Override
    public  void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/").setViewName("/index");
//        registry.addViewController("").setViewName("/login");
        //super.addViewControllers(registry);
//        super.addResourceHandlers();
//        super.addInterceptors();

    }

    /**
     * 设置资源映射器
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        super.addResourceHandlers(registry);
    }

    /**
     * 设置自定义拦截器
     * @param registry
     */
    public void addInterceptors(InterceptorRegistry registry){
        super.addInterceptors(registry);
    }
    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver resolver=new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/");
        resolver.setSuffix(".jsp");
        return resolver;
    }








}
