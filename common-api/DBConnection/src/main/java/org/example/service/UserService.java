package org.example.service;

import org.example.entity.User;

public interface UserService {

    void addUser(User user);

    void deleteUserById(int id);

    void updateUser(User user);

    User getUserById(int id);
}