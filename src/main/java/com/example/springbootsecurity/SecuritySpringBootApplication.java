package com.example.springbootsecurity;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
// import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * spring boot 启动类
 */
@SpringBootApplication
public class SecuritySpringBootApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SecuritySpringBootApplication.class, args);
        // try{
        // SpringApplication.run(SecuritySpringBootApplication.class, args);
        // //     new SpringApplicationBuilder(SecuritySpringBootApplication.class).build().run(args);
        // }catch (Exception e){
        //     System.out.println("错误"+e.getCause());
        //     System.out.println("错误"+e.getCause().getMessage());
        // }
    }
}
