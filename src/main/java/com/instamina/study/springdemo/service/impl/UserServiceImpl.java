package com.instamina.study.springdemo.service.impl;

import com.instamina.study.springdemo.dao.UserDao;
import com.instamina.study.springdemo.entity.User;
import com.instamina.study.springdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
