package com.example.springbootsecurity.controller;// package com.example.springboot_security.springboot.controller;// package cdu.weiyu.spring_security.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
// @EnableAutoConfiguration
@RestController
public class LoginController {
    // 必须写login-success
    @RequestMapping(value = "/login-success",produces = {"text/plain;charset=UTF-8"})
    public String loginSucess(){
        return "成功";
    }
    @GetMapping(value="/r/r1",produces = "text/plain;charset=UTF-8")
    public String r1(){
        return "成功";
    }
    @GetMapping(value="/r/r2",produces = "text/plain;charset=UTF-8")
    public String r2(){
        return "成功";
    }

}
