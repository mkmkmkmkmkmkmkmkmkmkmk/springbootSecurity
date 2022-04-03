package com.example.springbootsecurity.config;// package com.example.springboot_security.springboot.config;// package cdu.weiyu.spring_security.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * spring-security安全配置
 * 有springBoot加载配置
 * 不需要用EnableWebSecurity
 */
// @EnableWebSecurity
 @Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    //定义登录时用户信息查询
    @Bean
    protected UserDetailsService userDetailsService() {
        InMemoryUserDetailsManager manager =new InMemoryUserDetailsManager();
        manager.createUser(User.withUsername("zs").password("123").authorities("p1").build());
        manager.createUser(User.withUsername("ls").password("123").authorities("p2").build());
        return manager;
    }



    //密码编码器
    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/r/r1").hasAuthority("p1")
                .antMatchers("r/r2").hasAuthority("p2")
                .antMatchers("/r/**").authenticated()
                .anyRequest().permitAll()
                .and()
                .formLogin()
                .successForwardUrl("/login-success");
    }
}
