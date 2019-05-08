package com.instamina.study.springdemo.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private String userId;
    private String userName;
    private Date birthday;
    private String email;
    private String sex;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", birthday=" + birthday +
                ", email='" + email + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
