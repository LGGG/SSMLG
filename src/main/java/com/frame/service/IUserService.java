package com.frame.service;

import com.frame.entity.User;

public interface IUserService {
    public User getUserByName(String name);
    public boolean verify(String username,String pwd);
}