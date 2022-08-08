package com.project.TGDD.Service.ServiceImpl;

import com.project.TGDD.Model.User;
import com.project.TGDD.Repository.UserRepository;
import com.project.TGDD.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired private UserRepository userRepository;
    @Override
    public List<User> getAllUser(){
        List<User> listUser = (List<User>) userRepository.findAll();
        return listUser;

    }
    @Override
    public void addUser(User user){
        userRepository.save(user);
    }

    @Override
    public User findUserByNumberPhone(Integer numberPhone) {
           return userRepository.findUserByNumPhone(numberPhone);
    }
}
