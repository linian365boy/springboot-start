package com.springboot.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import com.springboot.constant.RoleConstant;
import com.springboot.dao.UserMapper;
import com.springboot.domain.UserEntity;
import com.springboot.service.UserService;

@Service
@Primary
public class BaseUserService implements UserService {

	private final UserMapper userMapper;

    public BaseUserService(UserMapper userMapper){
        this.userMapper = userMapper;
    }

    @Override
    public boolean insert(UserEntity userEntity) {
        String username = userEntity.getUsername();
        if (exist(username))
            return false;
        userEntity.setRoles(RoleConstant.ROLE_USER);
        int result = userMapper.insert(userEntity);
        return  result == 1;
    }

    @Override
    public UserEntity getByUsername(String username) {
        return userMapper.selectByUsername(username);
    }

    /**
     * 判断用户是否存在
     * @param username 账号
     * @return 密码
     */
    private boolean exist(String username){
        UserEntity userEntity = userMapper.selectByUsername(username);
        return (userEntity != null);
    }
	
}
