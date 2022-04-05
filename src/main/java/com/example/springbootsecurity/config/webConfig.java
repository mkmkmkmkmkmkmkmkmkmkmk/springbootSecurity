package com.example.springbootsecurity.config;// package com.example.springboot_security.springboot.config;// package cdu.weiyu.spring_security.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 相当于springMvc。xml
 */
@Configuration
// @EnableWebMvc
// @ComponentScan
public class webConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //
        registry.addViewController("/").setViewName("redirect:/login");
        registry.addViewController("/login").setViewName("index");
    }
}
