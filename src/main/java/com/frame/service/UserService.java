package com.frame.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frame.Mapper.UserMapper;
import com.frame.entity.User;

@Service("userService")
public class UserService implements IUserService{

    @Autowired
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User getUserByName(String name) {
        return userMapper.selectUserByUsername(name).get(0);
    }

    @Override
    public boolean verify(String username, String pwd) {
    	List<User> list = userMapper.selectUserByUsername(username);
    	User user = (User) list.get(0);
    	String password = user.getPassword();
        if(password.equals(pwd))
            return true;
        else return false;
    }

}