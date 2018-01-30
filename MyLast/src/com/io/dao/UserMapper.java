package com.io.dao;

import com.io.model.User;

public interface UserMapper {
    User getUserById(User user);
    User login(User user);
    User addBefore(User user);
    boolean addUser(User user);
    boolean updateUser(User user);
    boolean updateUserByHire(User user);
}
