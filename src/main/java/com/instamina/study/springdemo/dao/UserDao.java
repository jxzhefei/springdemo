package com.instamina.study.springdemo.dao;

import com.instamina.study.springdemo.entity.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();
}
