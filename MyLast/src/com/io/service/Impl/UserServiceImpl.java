package com.io.service.Impl;

import com.io.dao.UserMapper;
import com.io.model.User;
import com.io.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User login(User user) {
        User user1 = userMapper.login(user);
        if (user1!=null){
            return user1;
        }else {
            return null;
        }

    }

    @Override
    public boolean addUser(User user) {
        if (userMapper.addUser(user)){
            return true;
        }
        return false;
    }

    @Override
    public User addBefore(User user) {
        User user1 = userMapper.addBefore(user);
        return user1;
    }

    @Override
    public boolean updateUser(User user) {
        return userMapper.updateUser(user);
    }
}
