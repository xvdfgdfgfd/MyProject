package com.io.service;

import com.io.model.User;

public interface UserService {
    User login(User user);
    boolean addUser(User user);
    User addBefore(User user);
    boolean updateUser(User user);
}
