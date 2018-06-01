package com.frame.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.frame.entity.User;

public interface UserMapper {
    @Select("select * from user")
    public List<User> selectUser();
    @Select("select * from user where uname=#{username}")
    public List<User> selectUserByUsername(@Param("username")String username);

}