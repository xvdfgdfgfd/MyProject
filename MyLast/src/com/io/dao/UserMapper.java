package com.io.dao;

import com.io.model.User;

public interface UserMapper {
    User login(User user);
    User addBefore(User user);
    boolean addUser(User user);
}
