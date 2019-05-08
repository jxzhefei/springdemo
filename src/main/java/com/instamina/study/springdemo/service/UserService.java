package com.instamina.study.springdemo.service;

import com.instamina.study.springdemo.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
}
