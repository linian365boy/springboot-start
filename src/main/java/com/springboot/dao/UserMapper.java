package com.springboot.dao;

import org.apache.ibatis.annotations.Param;

import com.springboot.domain.UserEntity;

public interface UserMapper {
	//@Insert("insert into user(username, password, nickname, roles) values(#{username}, #{password}, #{nickname}, #{roles})")
    int insert(UserEntity userEntity);

    //@Select("select * from user where username = #{username}")
    UserEntity selectByUsername(@Param("username") String username);
}
