package com.project.TGDD.Service;

import com.project.TGDD.Model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
    void addUser(User user);
}
