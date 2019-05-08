package com.instamina.study.springdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping;
import org.springframework.web.servlet.mvc.SimpleControllerHandlerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan
public class SpringMVCServletConfig {
    @Bean
    public InternalResourceViewResolver getInternalResourceViewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setSuffix(".jsp");
        viewResolver.setPrefix("/jsp/");
        return viewResolver;
    }
    @Bean
    public BeanNameUrlHandlerMapping getBeanNameHandlerMapping (){
        return new BeanNameUrlHandlerMapping();
    }
    @Bean
    public SimpleControllerHandlerAdapter getSimpleControllerHandlerAdapter(){
        return new SimpleControllerHandlerAdapter();
    }
}
