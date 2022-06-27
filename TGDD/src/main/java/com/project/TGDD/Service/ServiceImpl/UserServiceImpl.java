package com.project.TGDD.Service.ServiceImpl;

import com.project.TGDD.Repository.UserRepository;
import com.project.TGDD.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired private UserRepository userRepository;
}
