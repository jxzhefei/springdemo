package com.instamina.study.springdemo.controller;

import com.instamina.study.springdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping(value="/queryAll.do")
    public String queryAll(){
        return userService.findAll().toString();
    }
}
